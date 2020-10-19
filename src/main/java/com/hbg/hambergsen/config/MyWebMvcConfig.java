package com.hbg.hambergsen.config;

import com.hbg.hambergsen.interceptor.ResponseResultInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyWebMvcConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 可添加多个
        // registry.addInterceptor(new ResponseResultInterceptor()).addPathPatterns("/**");  暂时不用
    }
}
