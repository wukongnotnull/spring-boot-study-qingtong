package com.wukongnotnull.domain;
//author: 悟空非空也（B站/知乎/公众号）

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Data
public class User implements Serializable {

    private Integer id;
    private String name;
    private Integer age;

}
