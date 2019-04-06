package com.chiyou.spring.aware;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

    public void say(){
        System.out.println("say dao ... ");
    }

}
