package com.wukongnotnull.vo;
//author: 悟空非空也（B站/知乎/公众号）
// 响应错误（失败）的信息封装枚举
public enum ResultCodeEnum {

    // 服务器错误
    SERVER_ERROR(500,"server error"),
    // 重定向
    REDIRECT(301, "redirect"),
    NOT_FOUND(404,"not found"),
    WUKONG_ERROR(1314,"wukong error is Unknown error "),
    USERNAME_REPEAT(520,"username  is  repeat")
    // 自定义错误提示
    ;


    /**
    * 响应状态码
     */
    private Integer code;
    /**
     * 响应信息
     */
    private String message;

    ResultCodeEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
