package com.chiyou.spring.ioc;

/**
 * @author wangxiansheng
 * @create 2019-03-31 12:59
 */
public class UserDao {

    public void save(User user) {
        System.out.println("user save success..." + user);
    }

}
