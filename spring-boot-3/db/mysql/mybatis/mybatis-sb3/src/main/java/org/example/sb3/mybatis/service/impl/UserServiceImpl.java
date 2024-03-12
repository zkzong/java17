package org.example.sb3.mybatis.service.impl;

import org.example.sb3.mybatis.domain.User;
import org.example.sb3.mybatis.mapper.UserMapper;
import org.example.sb3.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getAllUsers() {
        return userMapper.getAllUsers();
    }

    @Override
    public User findByUserName(String userName) {
        return userMapper.findByUserName(userName);
    }

    @Override
    public void insertOne(String userName, int age) {
        userMapper.insertOne(userName, age);
    }

    @Override
    public int insertBatch(List<User> userList) {
        return userMapper.insertBatch(userList);
    }

    @Override
    public int insertAndGetId(User users) {
        return userMapper.insertAndGetId(users);
    }

    @Override
    public User findByIndex(String userName, int age) {
        return userMapper.findByIndex(userName, age);
    }

    @Override
    public User findByMap(Map map) {
        return userMapper.findByMap(map);
    }

    @Override
    public User findByParam(String userName, int age) {
        return userMapper.findByParam(userName, age);
    }

    @Override
    public List<User> namein(List<String> names, String name) {
        return userMapper.namein(names, name);
    }

}
