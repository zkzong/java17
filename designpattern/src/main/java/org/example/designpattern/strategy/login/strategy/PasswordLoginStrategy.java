package org.example.designpattern.strategy.login.strategy;

import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @Author: zongz
 * @Date: 2025-12-21
 */
@Service
public class PasswordLoginStrategy implements LoginStrategy {
    @Override
    public String getLoginType() {
        return "password";
    }

    @Override
    public String execute(Map<String, Object> params) {
        String username = (String) params.get("username");
        String password = (String) params.get("password");
        // 模拟密码校验（实际应从数据库查询+密码解密）
        if (!"123456".equals(password)) {
            throw new IllegalArgumentException("密码错误");
        }
        // 模拟用户校验
        checkUserLocked(username);
        return "登录成功（用户名密码）";
    }

    private void checkUserLocked(String username) {
        // 调用用户服务检查账号是否锁定
        System.out.println("检查用户" + username + "是否锁定");
    }
}
