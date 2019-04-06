package com.chiyou.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author wangxiansheng
 * @create 2019-04-01 0:24
 *  切面类
 */
@Aspect
@Component
public class NotVeryUsefulAspect {

    @Pointcut("execution(* *(..))")
    private void anyOldTransfer(){
        System.out.println("pointcut");
    }

    @Before("execution(* *(..))")
    public void doAccessCheck(){
        System.out.println("before...");
    }

}
