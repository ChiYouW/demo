package com.mytomcat;

import java.io.IOException;

/**
 * @author wangxiansheng
 * @create 2019-03-10 16:20
 */
public class HelloWroldServlet extends MyServlet {

    @Override
    public void doGet(MyRequest request, MyResponse response) {
        try {
            response.write("get world...");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void doPost(MyRequest request, MyResponse response) {
        try {
            response.write("post world...");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
