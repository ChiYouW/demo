package com.chiyou.spring.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class SpringContextHolder implements ApplicationContextAware {

    private static ApplicationContext ac;

    public static ApplicationContext getApplicationContext() {
        return ac;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

        ac = applicationContext;

    }
}
