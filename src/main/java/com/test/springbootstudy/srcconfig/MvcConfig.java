package com.test.springbootstudy.srcconfig;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.Formatter;
import org.springframework.format.FormatterRegistry;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/**
 * @Creator NETTED-WYF
 * @CreateDate 2019/5/23 0023 下午 9:17
 * @Description TODO
 */
@Configuration
public class MvcConfig implements WebMvcConfigurer {

    //想访问templates下的页面，不用写controller跳转，配置自动跳转
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/from").setViewName("from");
    }

    //    格式化
    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addFormatter(new Formatter<Date>() {
            @Override
            public String print(Date date, Locale locale) {
                return null;
            }

            @Override
            public Date parse(String s, Locale locale) throws ParseException {
                return new SimpleDateFormat("yyyy-mm-dd").parse(s);
            }
        });
    }

    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        FastJsonHttpMessageConverter fc = new FastJsonHttpMessageConverter();
        FastJsonConfig fastJsonConfig = new FastJsonConfig();
        fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
        fc.setFastJsonConfig(fastJsonConfig);
        converters.add(fc);
    }
}
