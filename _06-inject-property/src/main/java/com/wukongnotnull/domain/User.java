package com.wukongnotnull.domain;
//author: 悟空非空也（B站/知乎/公众号）


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;

@Component
@Data
@ConfigurationProperties(prefix = "user", ignoreUnknownFields = true)
@Validated
public class User {

    @Email
    private String email;

}
