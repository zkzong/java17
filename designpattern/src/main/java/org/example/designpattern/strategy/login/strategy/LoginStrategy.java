package org.example.designpattern.strategy.login.strategy;

import java.util.Map;

public interface LoginStrategy {
    // 登录类型标识，如"password"、"wechat"
    String getLoginType();

    // 登录方法，参数用Map传递不同登录方式的参数
    String execute(Map<String, Object> params);
}
