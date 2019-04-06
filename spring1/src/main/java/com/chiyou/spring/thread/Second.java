package com.chiyou.spring.thread;

public class Second implements Runnable{

    @Override
    public void run() {
        while (true) {
            System.out.println(Thread.currentThread().getName() + "is running");
        }
    }

    public static void main(String[] args) {

       new Thread(new Second()).start();

        while (true){
            System.out.println(Thread.currentThread().getName() + "is running");
        }

    }

}
