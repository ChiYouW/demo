package com.mytomcat;

import java.io.IOException;

/**
 * @author wangxiansheng
 * @create 2019-03-10 16:23
 */
public class FindGirlServlet extends MyServlet {

    @Override
    public void doGet(MyRequest request, MyResponse response) {
        try {
            response.write("get girl...");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void doPost(MyRequest request, MyResponse response) {
        try {
            response.write("post girl...");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
