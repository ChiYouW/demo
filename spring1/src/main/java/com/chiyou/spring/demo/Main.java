package com.chiyou.spring.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author wangxiansheng
 * @create 2019-03-31 12:48
 */
public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);

        UserService bean = ac.getBean(UserService.class);

        bean.printUser();

        ac.close();

    }

}
