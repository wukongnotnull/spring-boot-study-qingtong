package com.wukongnotnull.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

//author: 悟空非空也（B站/知乎/公众号）
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private Integer id;

    @NotBlank(message = "用户名不能为空")
    private  String username;

    @NotBlank(message = "密码不能为空")
    private String password;

}
