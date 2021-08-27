package com.wukongnotnull.config;
//author: 悟空非空也（B站/知乎/公众号）

import com.wukongnotnull.interceptor.MyInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
public class MyMvcConfig implements WebMvcConfigurer {
    @Autowired
    private MyInterceptor myInterceptor;

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
       registry.addViewController("/login").setViewName("login");
        registry.addViewController("/home").setViewName("home");

    }

    // 哪些请求需要拦截器的过滤的
    // /login   -----> login.html 资源
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
       registry.addInterceptor(myInterceptor).addPathPatterns("/**").excludePathPatterns("/login");
    }
}
