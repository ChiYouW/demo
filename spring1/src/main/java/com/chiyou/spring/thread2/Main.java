package com.chiyou.spring.thread2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);

        UserService userService = ac.getBean(UserService.class);

        userService.async();

        userService.async2();

    }

}
