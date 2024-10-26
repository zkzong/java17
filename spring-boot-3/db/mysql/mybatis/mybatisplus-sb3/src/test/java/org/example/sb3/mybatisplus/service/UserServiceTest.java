package org.example.sb3.mybatisplus.service;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import org.example.sb3.mybatisplus.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: zongz
 * @Date: 2024/10/26
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {

    @Autowired
    private UserService userService;

    /**
     * 根据主键更新
     */
    @Test
    public void saveOrUpdate1() {
        User user = new User();
        user.setId(1);
        user.setAge(3);
        userService.saveOrUpdate(user);
    }

    /**
     * 根据指定字段更新
     */
    @Test
    public void saveOrUpdate2() {
        UpdateWrapper<User> updateWrapper = new UpdateWrapper<>();
        updateWrapper.eq("user_name", "java");

        User user = new User();
        // 设置id也不会更新
        user.setId(10);
        user.setAge(3);
        userService.saveOrUpdate(user, updateWrapper);
    }
}
