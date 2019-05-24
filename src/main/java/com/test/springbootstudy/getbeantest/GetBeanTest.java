package com.test.springbootstudy.getbeantest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Creator NETTED-WYF
 * @CreateDate 2019/5/22 0022 下午 11:04
 * @Description TODO
 */
public class GetBeanTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ParentConfig.class);
        Car bmw = (Car) context.getBean("bmw");
        bmw.print();
        Car toyota = (Car) context.getBean("toyota");
        toyota.print();
    }
}
