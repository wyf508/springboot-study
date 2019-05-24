package com.test.springbootstudy.getbeantest;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @Creator NETTED-WYF
 * @CreateDate 2019/5/22 0022 下午 11:eieapp
 * @Description TODO
 */
@Configuration
@Import({BeanConfiguration.class})
public class ParentConfig {

}
