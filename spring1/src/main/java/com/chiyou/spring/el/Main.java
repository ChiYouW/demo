package com.chiyou.spring.el;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {

        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(ElConfig.class);

        ElConfig elConfig = ac.getBean(ElConfig.class);

        BufferedReader reader = new BufferedReader(new InputStreamReader(elConfig.getHello().getInputStream()));

        String content = "";

        while ((content = reader.readLine()) != null){
            System.out.println(content);
        }

        System.out.println(elConfig.getUserName());

    }

}
