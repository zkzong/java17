package org.example.sb3.mybatis.service;

import org.apache.ibatis.annotations.Param;
import org.example.sb3.mybatis.domain.User;

import java.util.List;
import java.util.Map;

public interface UserService {

    List<User> getAllUsers();

    User findByUserName(String userName);

    void insertOne(String userName, int age);

    void insertOneWithDate(User user);

    int insertBatch(List<User> userList);

    int insertAndGetId(User users);

    User findByIndex(String userName, int age);

    User findByMap(Map map);

    User findByParam(@Param("userName") String userName, @Param("age") int age);

    List<User> namein(List<String> names, String name);

}
