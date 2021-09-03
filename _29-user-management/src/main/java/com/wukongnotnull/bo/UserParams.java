package com.wukongnotnull.bo;
/* author: 悟空非空也（B站/知乎/公众号） */


public class UserParams {

    private  Integer pageNum = 1; //当前页
    private  Integer pageSize = 3; //页容量（每页包含多少记录）
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

