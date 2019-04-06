package com.chiyou.spring.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class Listener2 implements ApplicationListener<Event> {
    @Override
    public void onApplicationEvent(Event event) {
        System.out.println("Listener2接收到了..." + event.getMes());
    }
}
