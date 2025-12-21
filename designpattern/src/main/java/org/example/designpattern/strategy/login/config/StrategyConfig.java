package org.example.designpattern.strategy.login.config;

import org.example.designpattern.strategy.login.strategy.LoginStrategy;
import org.example.designpattern.strategy.login.strategy.PasswordLoginStrategy;
import org.example.designpattern.strategy.login.strategy.SmsLoginStrategy;
import org.example.designpattern.strategy.login.strategy.WechatLoginStrategy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: zongz
 * @Date: 2025-12-21
 */
@Configuration
public class StrategyConfig {
    @Bean("passwordStrategy") // 自定义Bean名称
    public LoginStrategy passwordLoginStrategy() {
        return new PasswordLoginStrategy();
    }

    @Bean("wechatStrategy")
    public LoginStrategy wechatLoginStrategy() {
        return new WechatLoginStrategy();
    }

    @Bean("smsStrategy")
    public LoginStrategy smsLoginStrategy() {
        return new SmsLoginStrategy();
    }
}
