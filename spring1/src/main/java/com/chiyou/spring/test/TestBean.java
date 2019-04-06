package com.chiyou.spring.test;

public class TestBean {

    private String msg;

    public TestBean(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "TestBean{" +
                "msg='" + msg + '\'' +
                '}';
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
