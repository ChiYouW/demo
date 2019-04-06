package com.chiyou.spring.aop2;

import org.springframework.stereotype.Service;

/**
 * @author wangxiansheng
 * @create 2019-04-01 0:46
 */
@Service
public class UserService {

    @Logger
    public void hello(){
        System.out.println("hello");
    }

}
