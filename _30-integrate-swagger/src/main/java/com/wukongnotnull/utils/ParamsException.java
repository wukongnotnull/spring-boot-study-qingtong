package com.wukongnotnull.utils;

/**
 * author: 悟空非空也（B站/知乎/公众号）
 */

public class ParamsException extends RuntimeException {
    // 自定义异常类型码
    private Integer type = 300;
    // 自定义异常的说明信息
    private String msg = "默认自定义异常类型";

    public ParamsException(){
        super();
    }

    public ParamsException(Integer type){
        this.type = type;
    }

    public ParamsException(String msg) {
        this.msg = msg;
    }

    public  ParamsException(Integer type, String msg) {
        this.type = type;
        this.msg = msg;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}