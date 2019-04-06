package com.chiyou.spring.demo;

/**
 * @author wangxiansheng
 * @create 2019-03-31 12:48
 */
public class UserService {

    public User user;

    public void setUser(User user) {
        this.user = user;
    }

    public void printUser(){
        System.out.println(user);
    }

}
