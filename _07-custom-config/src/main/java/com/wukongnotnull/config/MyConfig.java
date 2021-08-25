package com.wukongnotnull.config;
//author: 悟空非空也（B站/知乎/公众号）

import com.wukongnotnull.domain.Pet;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @Bean(name = "aPet")
    public Pet getPet(){
        return new Pet();
    }

}
