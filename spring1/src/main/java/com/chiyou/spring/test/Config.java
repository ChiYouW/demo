package com.chiyou.spring.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@ComponentScan("com.chiyou.spring.test")
public class Config {

    @Bean
    @Profile("dev")
    public TestBean testDevBean(){
        return new TestBean("dev");
    }

    @Bean
    @Profile("prod")
    public TestBean testProdBean(){
        return new TestBean("prod");
    }

}
