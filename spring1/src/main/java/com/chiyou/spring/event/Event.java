package com.chiyou.spring.event;

import org.springframework.context.ApplicationEvent;

public class Event extends ApplicationEvent {

    private String mes;

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public Event(Object source,String msg) {
        super(source);
        this.mes = msg;
    }

}
