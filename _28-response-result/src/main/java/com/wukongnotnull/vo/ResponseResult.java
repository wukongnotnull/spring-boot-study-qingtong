package com.wukongnotnull.vo;
//author: 悟空非空也（B站/知乎/公众号）

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseResult implements Serializable {

    //是否响应成功  true 成功  false 失败
   private boolean success;
    // 响应状态码 200  500
   private Integer code;
   // 返回 错误信息  "什么具体错误"
   private String message;
    // 响应数据
    private Object data;




}
