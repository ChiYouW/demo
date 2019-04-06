package com.chiyou.spring.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {Config.class})
@ActiveProfiles("prod")
public class Demo {

    @Autowired
    private TestBean testBean;

    @Test
    public void beanMsg(){

        String expected = "prod";

        String actual = testBean.getMsg();

        Assert.assertEquals(expected,actual);

    }

}
