package com.wukongnotnull.controller;

import com.github.pagehelper.PageInfo;
import com.wukongnotnull.bo.UserParams;
import com.wukongnotnull.domain.User;
import com.wukongnotnull.service.UserService;

import com.wukongnotnull.vo.HttpResult;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
@Api(tags = "用户模块控制器")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users/{username}")
    @ApiOperation(value ="getUserByUsername接口",notes = "根据用户名查询用户")
    @ApiImplicitParam(
            name = "username", value = "用户名",
            required = true, dataType = "String",
            defaultValue = "默认值是。。。",
            paramType = "path"
    )
    public HttpResult getUserByUsername(@PathVariable String username){

        User userByUsername = this.userService.getUserByUsername(username);

        return HttpResult.success(userByUsername);
    }

    @GetMapping("/users/id/{id}")
    @ApiOperation(value = "getUserById接口", notes = "根据id查询用户")
    @ApiImplicitParam(
            name = "id", value = "用户id字段",
            required = true,dataType = "int",
            paramType = "path",defaultValue = "1"
    )
    public HttpResult<Object> getUserById(@PathVariable("id") Integer id){
        User user =this.userService.getUserById(id);

        return HttpResult.success(user);
    }

    @PostMapping("/users")
    @ApiOperation(value = "添加用户接口", notes = "实现添加用户的功能（详细一点）")
    @ApiImplicitParam(
            name = "user", value = "User对象",
            dataType = "User", paramType = "body",
            defaultValue = "默认值..."
    )
    public HttpResult addUser(@Validated  @RequestBody User user){

        User user1 = this.userService.addUser(user);

        return HttpResult.success(user1);


    }

    @PutMapping("/users")
    @ApiOperation(value = "modifyUser接口", notes = "实现用户信息的修改")
    @ApiImplicitParam(
            name = "user",value = "User对象",required = true,
            dataType = "User",paramType = "body",
            defaultValue = "默认值为..."
    )
    public HttpResult modifyUser(@RequestBody User user){
        User user1 = this.userService.modifyUser(user);

        return  HttpResult.success(user1);

    }

    @DeleteMapping("/users/{id}")
    @ApiOperation(value = "deleteUser接口", notes = "删除用户的功能")
    @ApiImplicitParam(
            name = "id",value = "用户id",
            defaultValue = "1", required = true,
            dataType = "int",paramType = "path"
    )
    public HttpResult<Object> deleteUser(@PathVariable Integer id) {
        this.userService.deleteUser(id);

        return HttpResult.success();

    }

    @GetMapping("/users")
    @ApiOperation(value = "getUserPageList接口", notes = "分页查询用户列表")
    @ApiImplicitParam(
            name = "userParams", value = "业务自定义对象",
            required = true,dataType = "UserParams",
            paramType = "body"
    )
    public HttpResult<Object> getUserPageList(@RequestBody  UserParams userParams){
        PageInfo<User> userPageList = this.userService.getUserPageList(userParams);
        return  HttpResult.success(userPageList);

    }

}