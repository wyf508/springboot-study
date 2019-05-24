package com.test.springbootstudy.getbeantest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Creator NETTED-WYF
 * @CreateDate 2019/5/22 0022 下午 10:54
 * @Description TODO
 */
@Configuration
public class BeanConfiguration {

    @Bean("bmw")
    public Car getBmw() {
        return new Bmw();
    }

    @Bean("toyota")
    public Car getToyota() {
        return new Toyota();
    }
}
