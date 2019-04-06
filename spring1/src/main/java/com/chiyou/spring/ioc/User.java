package com.chiyou.spring.ioc;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author wangxiansheng
 * @create 2019-03-31 12:59
 */
public class User {

    private String name;

    private Integer age;

    private Date birthday;

    private List<String> hobby;

    private Map<String,String> params;

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public List<String> getHobby() {
        return hobby;
    }

    public void setHobby(List<String> hobby) {
        this.hobby = hobby;
    }

    public Map<String, String> getParams() {
        return params;
    }

    public void setParams(Map<String, String> params) {
        this.params = params;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                ", hobby=" + hobby +
                ", params=" + params +
                '}';
    }
}
