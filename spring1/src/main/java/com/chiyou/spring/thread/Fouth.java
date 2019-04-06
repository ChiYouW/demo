package com.chiyou.spring.thread;

public class Fouth {


    public static void main(String[] args) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    System.out.println(Thread.currentThread().getName());
                }
            }
        }).start();

        while (true){
            System.out.println(Thread.currentThread().getName());
        }

    }

}
