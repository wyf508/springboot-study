package com.test.springbootstudy.propertiestest;

/**
 * @Creator NETTED-WYF
 * @CreateDate 2019/5/23 0023 上午 12:17
 * @Description TODO
 */
public class Dog {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
