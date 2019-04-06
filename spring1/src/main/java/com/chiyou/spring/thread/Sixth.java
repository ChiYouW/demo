package com.chiyou.spring.thread;

import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Sixth {

    public static void main(String[] args) {

        Executor threadPool = Executors.newFixedThreadPool(10);

        while (true) {

            threadPool.execute(new Runnable() {
                @Override
                public void run() {
                    while (true) {
                        try {
                            Thread.sleep(new Random().nextInt(100));
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println(Thread.currentThread().getName());
                    }
                }
            });
        }
    }

}
