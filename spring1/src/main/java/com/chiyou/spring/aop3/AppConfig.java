package com.chiyou.spring.aop3;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@Configuration
@ComponentScan("com.chiyou.spring.aop3")
public class AppConfig {
}
