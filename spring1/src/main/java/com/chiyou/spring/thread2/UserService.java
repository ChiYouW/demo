package com.chiyou.spring.thread2;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Async
    public void async(){
        while (true){
            System.out.println(Thread.currentThread().getName());
        }
    }

    @Async
    public void async2(){
        while (true){
            System.out.println(Thread.currentThread().getName());
        }
    }

}
