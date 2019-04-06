package com.chiyou.spring.aware;

public class UserService {

    public void say() {
        UserDao userDao = SpringContextHolder.getApplicationContext().getBean(UserDao.class);
        userDao.say();
        System.out.println("say service ...");
    }

}
