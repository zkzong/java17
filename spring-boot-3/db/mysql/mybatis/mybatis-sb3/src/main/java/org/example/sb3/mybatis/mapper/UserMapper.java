package org.example.sb3.mybatis.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.example.sb3.mybatis.domain.User;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserMapper {

    List<User> getAllUsers();

    User findByUserName(String userName);

    void insertOne(@Param("userName") String userName, @Param("age") int age);

    int insertBatch(@Param("userlist") List<User> userList);

    int insertAndGetId(User users);

    User findByIndex(String userName, int age);

    User findByMap(Map map);

    User findByParam(@Param("userName") String userName, @Param("age") int age);

    List<User> namein(@Param("names") List<String> names, @Param("name") String name);

}
