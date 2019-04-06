package com.chiyou.spring.aop3;

import org.springframework.stereotype.Service;

/**
 * @author wangxiansheng
 * @create 2019-04-01 0:46
 */
@Service
public class UserService {

    @Logger
    public void hello1(String name) {
        System.out.println("hello:" + name);
    }

    @Logger
    public String hello(String name) {
       return name;
    }

}
