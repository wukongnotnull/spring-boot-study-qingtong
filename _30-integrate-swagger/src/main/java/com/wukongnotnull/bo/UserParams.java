package com.wukongnotnull.bo;
/* author: 悟空非空也（B站/知乎/公众号） */

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "业务所需用户参数封装类")
public class UserParams {
    @ApiModelProperty(name = "pageNum",value = "当前页码",example = "1")
    private  Integer pageNum = 1; //当前页
    @ApiModelProperty(name = "pageSize",value = "状态码",example = "3")
    private  Integer pageSize = 3; //页容量（每页包含多少记录）
    @ApiModelProperty(name = "username",value = "用户名")
    private  String username;

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}

