package com.chiyou.spring.schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    // 执行三秒后执行
    @Scheduled(fixedDelay = 3000)
    public void a(){
        System.out.println("aaa");

    }

    // 每隔三秒打印一次
    @Scheduled(fixedRate = 3000)
    public void b(){
        System.out.println("bbb");

    }

}
