package com.chiyou.spring.thread;

public class First extends Thread {

    @Override
    public void run() {
        while (true) {
            System.out.println(Thread.currentThread().getName() + "is running");
        }
    }

    public static void main(String[] args) {

        new First().start();

        while (true){
            System.out.println(Thread.currentThread().getName() + "is running");
        }

    }

}
