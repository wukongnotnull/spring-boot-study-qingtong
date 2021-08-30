package com.wukongnotnull.domain;
//author: 悟空非空也（B站/知乎/公众号）

import org.hibernate.validator.constraints.Length;


import javax.validation.constraints.NotBlank;
import java.io.Serializable;

public class User implements Serializable {

    private  Integer id;
    @NotBlank(message = "用户名不能为空")
    private  String username;

    @Length(min=3,max=10,message = "密码长度为3-10之间")
    @NotBlank(message = "密码不能为空")
    private  String password;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
