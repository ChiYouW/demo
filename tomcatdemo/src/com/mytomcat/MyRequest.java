package com.mytomcat;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author wangxiansheng
 * @create 2019-03-10 15:04
 * 封装请求对象类
 * 通过输入流,对http协议进行解析,拿到http请求头的方法以及url
 */
public class MyRequest {

    private String url;

    private String method;

    public String getUrl() {
        return url;
    }

    public String getMethod() {
        return method;
    }

    public MyRequest(InputStream inputStream) throws IOException {

        String httpRequest = "";

        byte[] httpRequestBytes = new byte[1024];

        int length = 0;

        if ((length = inputStream.read(httpRequestBytes)) > 0) {
            httpRequest = new String(httpRequestBytes, 0, length);
        }
        String httpHead = httpRequest.split("\n")[0];

        url = httpHead.split("\\s")[1];

        if ("/favicon.ico".equalsIgnoreCase(url)) {
            url = "/girl";
        }

        method = httpRequest.split("\\s")[0];

        System.out.println(this);
    }

    @Override
    public String toString() {
        return "MyRequest{" +
                "url='" + url + '\'' +
                ", method='" + method + '\'' +
                '}';
    }
}
