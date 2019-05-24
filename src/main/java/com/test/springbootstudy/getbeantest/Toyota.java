package com.test.springbootstudy.getbeantest;

/**
 * @Creator NETTED-WYF
 * @CreateDate 2019/5/22 0022 下午 10:52
 * @Description TODO
 */
public class Toyota implements  Car {
    @Override
    public void print() {
        System.out.println("我是丰田车");
    }
}
