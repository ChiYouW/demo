package com.chiyou.spring.ioc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.*;

/**
 * @author wangxiansheng
 * @create 2019-03-31 12:57
 */
@Configuration
@ComponentScan("com.chiyou.spring.demo")
public class Config {

    @Bean
    public User getUser(){
        User user = new User();
        user.setAge(0);
        user.setBirthday(new Date());
        List<String> list = new ArrayList<String>();
        list.add("篮球");
        list.add("足球");
        user.setHobby(list);
        user.setName("张三");
        Map<String, String> params = new HashMap<String, String>();
        params.put("key1","value1");
        params.put("key2","value2");
        params.put("key3","value3");
        params.put("key4","value4");
        user.setParams(params);
        return user;
    }

    @Bean
    public UserDao getUserDao(){
        return new UserDao();
    }

    @Bean
    public UserService getUserService(){
        UserServiceImpl service = new UserServiceImpl();
        service.setUserDao(getUserDao());
        return service;
    }

}
