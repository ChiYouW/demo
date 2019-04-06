package com.chiyou.spring.aop2;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author wangxiansheng
 * @create 2019-04-01 0:43
 */
//生效时间： 在运行时生效
@Retention(RetentionPolicy.RUNTIME)
//注解放在方法上生效 类上：TYPE
@Target(ElementType.METHOD)
public @interface Logger {
}
