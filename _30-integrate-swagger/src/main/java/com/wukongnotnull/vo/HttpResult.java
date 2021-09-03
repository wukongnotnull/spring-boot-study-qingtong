package com.wukongnotnull.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

//author: 悟空非空也（B站/知乎/公众号）
@ApiModel(description = "统一响应信息类")
public class HttpResult<T> implements Serializable {
    /**
     * 是否响应成功
     */
    @ApiModelProperty(name = "success",value = "是否响应成功")
    private Boolean success;
    /**
     * 响应状态码
     */
    @ApiModelProperty(name = "code",value = "状态码",example = "200")
    private Integer code;
    /**
     * 响应数据
     */
    @ApiModelProperty(name = "data",value = "响应数据")
    private T data;
    /**
     * 错误信息
     */
    @ApiModelProperty(name = "message",value = "错误提示信息")
    private String message;



    // 响应成功的时候，new 的对象
    private HttpResult() {
        this.code=200;
        this.success = true;
    }
    // 响应成功，不携带Data
    public static<T> HttpResult<T> success(){
        return new HttpResult<T>();
    }



    // 响应成功时的构造器
    private HttpResult(T data){
        this.code=200;
        this.success = true;
        this.data = data;
    }
    // 响应成功，携带Data
    public static<T> HttpResult<T> success(T data){
        return new HttpResult<T>(data);
    }




    // 响应失败的时候的构造器
    private HttpResult(ResultCodeEnum resultCode){
        this.success = false;
        this.code=resultCode.getCode() ;
        this.message= resultCode.getMessage();
    }
    // 响应失败时，如何创建实例
    public static<T> HttpResult<T> failure(ResultCodeEnum resultCode){
        return new HttpResult<T>(resultCode);
    }





    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


    @Override
    public String toString() {
        return "HttpResult{" +
                "success=" + success +
                ", code=" + code +
                ", data=" + data +
                ", message='" + message + '\'' +
                '}';
    }
}
