package com.mytomcat;

import java.io.IOException;
import java.io.OutputStream;

/**
 * @author wangxiansheng
 * @create 2019-03-10 15:13
 * 封装响应对象
 */
public class MyResponse {

    private OutputStream outputStream;

    public MyResponse(OutputStream outputStream) {
        this.outputStream = outputStream;
    }

    /**
     * 基于HTTP协议的格式进行输出写入
     *
     * @param content
     * @throws IOException
     */
    public void write(String content) throws IOException {

        // http响应协议
        // HTTP/1.1 200 ok
        // Content-Type : text/html
        // <html><body></body></html>

        StringBuffer httpResponse = new StringBuffer();
        httpResponse.append("HTTP/1.1 200 ok\n")
                .append("Content-Type: text/html\r\n")
                .append("\r\n")
                .append("<html><body>")
                .append(content)
                .append("</body></html>");
        System.out.println("向页面输出");
        outputStream.write(httpResponse.toString().getBytes());
        outputStream.flush();
        outputStream.close();
    }

}
