package com.test.springbootstudy.propertiestest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @Creator NETTED-WYF
 * @CreateDate 2019/5/22 0022 下午 11:51
 * @Description TODO 以@Value方式进行读取配置文件值
 */
@Component
@Validated
//@ConfigurationProperties(prefix = "person")
public class Person1 {

    @Value("${person.firstName}")
    String firstName;

    @Value("${person.lastName}")
    String lastName;

    //JSR303校验
    @Email
    @Value("${person.email}")
    String email;

    @Value("${person.age}")
    int age;

    @Value("${person.boos}")
    boolean boos;

    @Value("${person.birth}")
    Date birth;

    /**
     * 不支持复杂数据类型！
     */
    //@Value("${person.maps}")
    Map<String, String> maps;

    //@Value("${person.list}")
    List<String> list;

    //@Value("${person.dog}")
    Dog dog;

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isBoos() {
        return boos;
    }

    public void setBoos(boolean boos) {
        this.boos = boos;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Map<String, String> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person1{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", boos=" + boos +
                ", birth=" + birth +
                ", maps=" + maps +
                ", list=" + list +
                ", dog=" + dog +
                '}';
    }
}
