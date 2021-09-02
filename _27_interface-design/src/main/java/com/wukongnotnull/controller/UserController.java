package com.wukongnotnull.controller;

import com.wukongnotnull.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

//author: 悟空非空也（B站/知乎/公众号）
@Controller
@RequestMapping("/api/v1")
public class UserController {
    @ResponseBody
    @RequestMapping(value = "/users",method = RequestMethod.POST,consumes = {"multipart/form-data"} )
    public String testParams(){
        System.out.println("testParams处理了请求");
        return "testParams";
    }


  //  @RequestMapping(value = "/users/{id}",method = RequestMethod.GET)
/*     @ResponseBody
    @GetMapping(value = {"/users/{id}","/abc"})
    public String findUserById( @PathVariable("id")Integer id){
        System.out.println(id);
        return "findUserById";
    }*/

   // @RequestMapping(value = "/users/{id}/{name}",method = RequestMethod.GET)
/*    @GetMapping(value = "/users/{id}/{name}")
    public String findUser(@PathVariable("id") Integer id,@PathVariable("name") String name){
        System.out.println(id);
        System.out.println(name);
        return "findUser";
    }*/

/*    @RequestMapping(value = "/users",method = RequestMethod.POST)
    public String insertUser(@RequestBody User user){
        System.out.println(user);
        return "insertUser";
    }*/

/*    @PostMapping(value = "/users")
    public String insertUser2(@RequestBody  Map map){
        System.out.println(map);
        return "插入成功";
    }*/
    // 分页查询
    @ResponseBody
    @GetMapping(value = "/users/{zhubajie}/{wukong}")
    public String queryUserList(@RequestParam("page") Integer curPageNo,
                                @RequestParam("per_page") Integer pageSize,
                                @PathVariable("wukong") Integer id,
                                @PathVariable("zhubajie") String username
    ){
        System.out.println(curPageNo);
        System.out.println(pageSize);
        return "分页查询";
    }

    @ResponseBody
    @RequestMapping(value = "/users",method = RequestMethod.POST)
    public String insertUser3(@RequestBody List<User> userList){
        System.out.println(userList);
        return "insertUser";
    }

    @ResponseBody
    @GetMapping("/users/{id}")
    public User queryUser(@PathVariable("id") Integer id){
        System.out.println(id);
        User user = new User();
        return user;
    }

}
