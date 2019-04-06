package com.chiyou.spring.aop2;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author wangxiansheng
 * @create 2019-04-01 0:46
 */
@Aspect
@Component
public class MyAspect {

    @Before("@annotation(com.chiyou.spring.aop2.Logger)")
    public void before() {
        System.out.println("before");
    }

}
