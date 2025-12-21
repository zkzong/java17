package org.example.designpattern.strategy.login.strategy;

import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @Author: zongz
 * @Date: 2025-12-21
 */
@Service
public class SmsLoginStrategy implements LoginStrategy {
    @Override
    public String getLoginType() {
        return "sms";
    }

    @Override
    public String execute(Map<String, Object> params) {
        String phone = (String) params.get("phone");
        String code = (String) params.get("code");
        // 模拟验证码校验（实际应从Redis获取）
        if (!"666888".equals(code)) {
            throw new IllegalArgumentException ("验证码错误");
        }
        // 模拟用户校验
        checkPhoneRegistered(phone);
        return "登录成功（手机号验证码）";
    }

    private void checkPhoneRegistered(String phone) {
        // 检查手机号是否注册
        System.out.println("检查手机号" + phone + "是否注册");
    }
}
