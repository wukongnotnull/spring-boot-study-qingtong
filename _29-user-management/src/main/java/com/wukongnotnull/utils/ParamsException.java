package com.wukongnotnull.utils;

/**
 * author: 悟空非空也（B站/知乎/公众号）
 */

public class ParamsException extends RuntimeException {

    private Integer code = 300;
    private String msg = "默认参数异常提示";

    public ParamsException(){
        super();
    }

    public ParamsException(Integer code){
        this.code = code;
    }

    public ParamsException(String msg) {
        this.msg = msg;
    }

    public  ParamsException(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}