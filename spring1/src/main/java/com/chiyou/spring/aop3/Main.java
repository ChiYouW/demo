package com.chiyou.spring.aop3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author wangxiansheng
 * @create 2019-04-01 0:50
 */
public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

        UserService userService = ac.getBean(UserService.class);

        String name = userService.hello("小明");

        System.out.println(name);

        ac.close();

    }

}
