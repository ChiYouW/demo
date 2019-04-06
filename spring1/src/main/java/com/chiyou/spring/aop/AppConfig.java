package com.chiyou.spring.aop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author wangxiansheng
 * @create 2019-03-31 14:08
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.chiyou.spring.aop")
public class AppConfig {

}
