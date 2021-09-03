package com.wukongnotnull.mapper;
import com.wukongnotnull.bo.UserParams;
import com.wukongnotnull.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {

     User getUserByUsername(String username);


    User getUserById(@Param("id") Integer id);

    int addUser(User user);

    int modifyUser(User user);

    int deleteUser(Integer id);

    List<User> getUserList(UserParams userParams);

}