package com.wukongnotnull.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

//author: 悟空非空也（B站/知乎/公众号）
@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description = "User实体类")
public class User {
    // 当类型为Integer类型时候, example 必须要写
    @ApiModelProperty(name = "id",value = "用户id",example = "1")
    private Integer id;

    @ApiModelProperty(name = "username",value = "用户名")
    @NotBlank(message = "用户名不能为空")
    private  String username;

    @ApiModelProperty(name = "password",value = "用户密码")
    @NotBlank(message = "密码不能为空")
    private String password;

}
