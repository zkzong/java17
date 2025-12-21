package org.example.designpattern.strategy.login.strategy;

import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @Author: zongz
 * @Date: 2025-12-21
 */
@Service
public class WechatLoginStrategy implements LoginStrategy {
    @Override
    public String getLoginType() {
        return "wechat";
    }

    @Override
    public String execute(Map<String, Object> params) {
        String authCode = (String) params.get("authCode");
        // 模拟调用微信接口获取用户信息
        String openId = callWechatApi(authCode);
        // 模拟数据库查询用户绑定关系
        String userId = getUserIdByOpenId(openId);
        if (userId == null) {
            throw new IllegalArgumentException ("微信账号未绑定系统用户");
        }
        return "登录成功（微信扫码）";
    }

    private String getUserIdByOpenId(String openId) {
        return openId;
    }

    private String callWechatApi(String authCode) {
        // 实际应调用微信开放平台API
        System.out.println("调用微信接口，authCode=" + authCode);
        return "wechat_open_id_123";
    }
}
