package com.wukongnotnull.controller;

import com.github.pagehelper.PageInfo;
import com.wukongnotnull.bo.UserParams;
import com.wukongnotnull.domain.User;
import com.wukongnotnull.service.UserService;
import com.wukongnotnull.utils.ParamsException;
import com.wukongnotnull.vo.HttpResult;
import com.wukongnotnull.vo.ResultCodeEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users/{username}")
    public HttpResult getUserByUsername(@PathVariable String username){

        User userByUsername = this.userService.getUserByUsername(username);

        return HttpResult.success(userByUsername);
    }

    @GetMapping("/users/id/{id}")
    public HttpResult<Object> getUserById(@PathVariable("id") Integer id){
        User user =this.userService.getUserById(id);

        return HttpResult.success(user);
    }

    @PostMapping("/users")
    public HttpResult addUser(@Validated  @RequestBody User user){

        User user1 = this.userService.addUser(user);

        return HttpResult.success(user1);


    }

    @PutMapping("/users")
    public HttpResult modifyUser(@RequestBody User user){
        User user1 = this.userService.modifyUser(user);

        return  HttpResult.success(user1);

    }

    @DeleteMapping("/users/{id}")
    public HttpResult<Object> deleteUser(@PathVariable Integer id) {
        this.userService.deleteUser(id);

        return HttpResult.success();

    }

    @GetMapping("/users")
    public HttpResult<Object> getUserPageList(@RequestBody UserParams userParams){
        PageInfo<User> userPageList = this.userService.getUserPageList(userParams);
        return  HttpResult.success(userPageList);

    }

}