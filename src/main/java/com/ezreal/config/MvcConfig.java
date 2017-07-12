package com.ezreal.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
/**
 * Created by Ezreal# on 2017/7/11.
 */
@Configuration
public class MvcConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {

//        registry.addInterceptor(new CheckLoginInterceptor()).addPathPatterns("/**");
//        super.addInterceptors(registry);
    }
}