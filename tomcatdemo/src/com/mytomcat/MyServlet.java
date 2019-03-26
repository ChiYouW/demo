package com.mytomcat;

/**
 * @author wangxiansheng
 * @create 2019-03-10 16:07
 * tomcat是满足servlet规范的容器,那么必定要提供一些API,就如常见的 doget dopost service
 */
public abstract class MyServlet {

    public abstract void doGet(MyRequest request,MyResponse response);

    public abstract void doPost(MyRequest request,MyResponse response);

    public void service(MyRequest request,MyResponse response){
        if("POST".equalsIgnoreCase(request.getMethod())){
            doPost(request,response);
        }else if("GET".equalsIgnoreCase(request.getMethod())){
            doGet(request,response);
        }
    }

}
