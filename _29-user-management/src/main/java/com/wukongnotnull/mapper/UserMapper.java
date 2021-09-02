package com.wukongnotnull.mapper;
import com.wukongnotnull.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {

     User getUserByUsername(String username);


    User getUserById(@Param("id") Integer id);

    int addUser(User user);

    int modifyUser(User user);

}