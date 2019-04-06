package com.chiyou.spring.aop2;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author wangxiansheng
 * @create 2019-04-01 0:42
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.chiyou.spring.aop2")
public class AppConfig {
}
