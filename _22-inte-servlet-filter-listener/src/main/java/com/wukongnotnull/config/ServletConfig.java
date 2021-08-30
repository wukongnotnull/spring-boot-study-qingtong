package com.wukongnotnull.config;
/* author: 悟空非空也（B站/知乎/公众号） */

import com.wukongnotnull.servlet.MyServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class ServletConfig {

    // 注册Servlet组件
    @Bean
    public ServletRegistrationBean<MyServlet> getServlet(MyServlet myServlet){

        return new ServletRegistrationBean<>(myServlet,"/myServlet");
    }


}