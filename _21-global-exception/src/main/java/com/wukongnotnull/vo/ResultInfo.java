package com.wukongnotnull.vo;

import lombok.Data;

//author: 悟空非空也（B站/知乎/公众号）
// 响应信息封装类
@Data
public class ResultInfo {

    private Integer  code;  // 响应状态码  200  500 404  1314

    private  String  msg;  // 说明响应状态码的含义

    private  Object  data;  // 后端返回给前端（浏览器）的数据信息

}
