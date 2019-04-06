package com.chiyou.spring.thread;

public class Third {

    public static void main(String[] args) {

        new Thread(){
            @Override
            public void run() {
                while (true){
                    System.out.println(Thread.currentThread().getName());
                }
            }
        }.start();

        while (true){
            System.out.println(Thread.currentThread().getName() + "is running");
        }

    }


}
