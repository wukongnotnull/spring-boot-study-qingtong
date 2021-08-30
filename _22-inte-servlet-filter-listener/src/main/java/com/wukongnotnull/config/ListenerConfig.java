package com.wukongnotnull.config;
/* author: 悟空非空也（B站/知乎/公众号） */

import com.wukongnotnull.servlet.MyListener;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ListenerConfig {

    @Bean
    public ServletListenerRegistrationBean<MyListener> getListener(MyListener myListener){
        return new ServletListenerRegistrationBean<>(myListener);
    }

}