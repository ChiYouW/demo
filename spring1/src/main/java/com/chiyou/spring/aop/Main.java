package com.chiyou.spring.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author wangxiansheng
 * @create 2019-04-01 0:33
 */
public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

        UserService userService = ac.getBean(UserService.class);

        userService.hello();

        ac.close();

    }

}
