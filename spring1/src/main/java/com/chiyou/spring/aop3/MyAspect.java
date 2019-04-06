package com.chiyou.spring.aop3;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author wangxiansheng
 * @create 2019-04-01 0:46
 */
@Aspect
@Component
public class MyAspect {

    @Before("@annotation(com.chiyou.spring.aop3.Logger)")
    public void before(JoinPoint point) {
        Object[] args = point.getArgs(); // 获取方法参数
        MethodSignature ms = (MethodSignature) point.getSignature(); // 获取方法
        System.out.println(ms.getName() + " before " + Arrays.toString(args));
    }

    /**
     * 获取返回值
     *
     * @param point 切点对象
     * @param obj   被增强的方法的返回值,要个returning的名字一致
     */
    @AfterReturning(value = "@annotation(com.chiyou.spring.aop3.Logger)", returning = "obj")
    public void afterRe(JoinPoint point, Object obj) {
        System.out.println("after" + obj);
    }

    @Around(value = "@annotation(com.chiyou.spring.aop3.Logger)")
    public Object around(ProceedingJoinPoint joinPoint) {
        System.out.println("before..." + Arrays.toString(joinPoint.getArgs()));

        Object[] args = joinPoint.getArgs();

        if (args.length == 1) {
            args[0] = "xiugai";
        }
        Object obj = null;
        try {
            obj = joinPoint.proceed(args); // 执行方法
            if (obj instanceof String) {
                obj = "小红";
            }
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return obj;
    }

}
