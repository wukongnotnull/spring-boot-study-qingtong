package com.wukongnotnull.config;
/* author: 悟空非空也（B站/知乎/公众号） */

import com.wukongnotnull.servlet.MyFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import java.util.Arrays;
import java.util.Collections;

@Configuration
public class FilterConfig {

    // 注册filter组件
    @Bean
    public FilterRegistrationBean<MyFilter> getFilter(MyFilter myFilter){
        FilterRegistrationBean<MyFilter> myFilterFilterRegistrationBean = new FilterRegistrationBean<>(myFilter);
        myFilterFilterRegistrationBean.setUrlPatterns(Arrays.asList("/myServlet"));
        return myFilterFilterRegistrationBean;

    }

}