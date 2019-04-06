package com.chiyou.spring.aware;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);

        //UserService userService = ac.getBean(UserService.class);

        UserService userService = new UserService();

        userService.say();

        ac.close();

    }

}
