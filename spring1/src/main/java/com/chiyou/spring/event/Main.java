package com.chiyou.spring.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);

        Publisher publisher = ac.getBean(Publisher.class);

        publisher.publish("消息");

        ac.close();

    }

}
