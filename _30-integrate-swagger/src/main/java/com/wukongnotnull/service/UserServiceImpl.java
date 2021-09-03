package com.wukongnotnull.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wukongnotnull.bo.UserParams;
import com.wukongnotnull.domain.User;
import com.wukongnotnull.mapper.UserMapper;
import com.wukongnotnull.utils.AssertUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserByUsername(String username) {
        return this.userMapper.getUserByUsername(username);
    }

    @Override
    public User getUserById(Integer id) {
        return this.userMapper.getUserById(id);
    }

    /**
     *  字段非空判断
     *  username 不能重复
     */
    public User addUser(User user) {

        AssertUtil.isTrue(userMapper.getUserByUsername(user.getUsername()) !=null,520,"用户名重复，请重新输入");
        User user1 = null;
        int i = userMapper.addUser(user);
        if(i == 1){  // 添加成功
            user1 = this.getUserByUsername(user.getUsername());
        }else { // 添加失败
            System.out.println("用户添加失败");
        }
        return user1;
    }

    @Override
    public User modifyUser(User user) {
        //username 不能已存在，除了自己
        User userByUsername = this.userMapper.getUserByUsername(user.getUsername());
        AssertUtil.isTrue(userByUsername != null && user.getId().equals(userByUsername.getId()),520,"用户名重复，请重新输入");
        //修改用户信息
        int i = userMapper.modifyUser(user);

        return this.getUserByUsername(user.getUsername());

    }

    public void deleteUser(Integer id) {

        //是否存在该用户
        User userById = this.getUserById(id);

        //删除用户
        if(userById != null) {
          this.userMapper.deleteUser(id);
        }else {
            System.out.println("删除此用户时，发现该用户不存在！！");
        }


    }

    public PageInfo<User> getUserPageList(UserParams userParams) {

        PageHelper.startPage(userParams.getPageNum(), userParams.getPageSize());

        return new PageInfo<User>(this.userMapper.getUserList(userParams));
    }


}