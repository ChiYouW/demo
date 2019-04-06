package com.chiyou.spring.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author wangxiansheng
 * @create 2019-03-31 12:47
 */
@Configuration
@ComponentScan("com.chiyou.spring.demo")
public class Config {

    @Bean
    public UserService getUserService() {
        User user = new User();
        user.setName("张三");
        user.setAge(18);

        UserService service = new UserService();
        service.setUser(user);
        return service;
    }

}
