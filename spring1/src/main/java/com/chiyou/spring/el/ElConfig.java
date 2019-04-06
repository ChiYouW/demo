package com.chiyou.spring.el;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import javax.annotation.Resource;

@Configuration
@ComponentScan("com.chiyou.spring.el")
@PropertySource("classpath:conf.properties")
public class ElConfig {

    // 在注入不进的情况下,需要将这个类交给Spring管理
    @Bean
    private static PropertySourcesPlaceholderConfigurer property() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    @Value("${user}")
    private String user;

    @Value("${password}")
    private String password;

    @Value("${driver}")
    private String driver;

    @Value("${url}")
    private String url;

    @Value("#{systemProperties['os.name']}")
    private String osName;

    @Value("http://www.baidu.com")
    private org.springframework.core.io.Resource content;

    @Value("classpath:hello.txt")
    private org.springframework.core.io.Resource hello;

    @Value("#{user.name}")
    private String userName;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getOsName() {
        return osName;
    }

    public void setOsName(String osName) {
        this.osName = osName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public org.springframework.core.io.Resource getContent() {
        return content;
    }

    public void setContent(org.springframework.core.io.Resource content) {
        this.content = content;
    }

    public org.springframework.core.io.Resource getHello() {
        return hello;
    }

    public void setHello(org.springframework.core.io.Resource hello) {
        this.hello = hello;
    }

    @Override
    public String toString() {
        return "ElConfig{" +
                "user='" + user + '\'' +
                ", password='" + password + '\'' +
                ", driver='" + driver + '\'' +
                ", url='" + url + '\'' +
                ", osName='" + osName + '\'' +
                '}';
    }
}
