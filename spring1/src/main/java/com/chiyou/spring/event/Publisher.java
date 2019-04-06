package com.chiyou.spring.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Publisher {

    @Autowired
    public ApplicationContext applicationContext;

    public void publish(String msg){
        applicationContext.publishEvent(new Event(this,msg));
    }

}
