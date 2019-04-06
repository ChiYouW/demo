package com.chiyou.spring.ioc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author wangxiansheng
 * @create 2019-03-31 13:15
 */
public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);

        UserService bean = ac.getBean(UserService.class);

        bean.saveUser(ac.getBean(User.class));
    }

}
