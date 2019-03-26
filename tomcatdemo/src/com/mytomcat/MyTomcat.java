package com.mytomcat;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

/**
 * @author wangxiansheng
 * @create 2019-03-10 17:55
 */
public class MyTomcat {

    private int port = 8080;

    private Map<String, String> urlServletMap = new HashMap<String, String>();

    public MyTomcat(int port) {
        this.port = port;
    }

    public void start() {
        initServletMapping();

        ServerSocket serverSocket = null;

        try {
            serverSocket = new ServerSocket(port);
            System.out.println("MyTomcat start ...");

            while (true){

                Socket socket = serverSocket.accept();

                InputStream inputStream = socket.getInputStream();

                OutputStream outputStream = socket.getOutputStream();

                MyRequest request = new MyRequest(inputStream);

                MyResponse response = new MyResponse(outputStream);

                //请求分发
                dispatch(request,response);

                socket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(serverSocket != null){
                try {
                    serverSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    /**
     * 初始化URL与对应处理的servlet的关系
     */
    private synchronized void initServletMapping() {
        for (ServletMapping servletMapping : ServletMappingConfig.servletMappingList) {
            urlServletMap.put(servletMapping.getUrl(), servletMapping.getClazz());
        }
    }

    private void dispatch(MyRequest request,MyResponse response) {

        String clazz = urlServletMap.get(request.getUrl());

        System.err.println(clazz);

        try {
            Class<MyServlet> myServletClass = (Class<MyServlet>) Class.forName(clazz);

            MyServlet myServlet = myServletClass.newInstance();

            myServlet.service(request,response);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }catch (NullPointerException e) {
            //e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        new MyTomcat(8080).start();

    }

}
