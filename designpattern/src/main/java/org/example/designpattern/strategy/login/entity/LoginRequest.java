package org.example.designpattern.strategy.login.entity;

import lombok.Data;

import java.util.Map;

/**
 * @Author: zongz
 * @Date: 2025-12-21
 */
@Data
public class LoginRequest {
    // 登录类型，如"password"、"wechat"
    private String loginType;
    // 具体参数，不同登录方式不同
    private Map<String, Object> params;
}
