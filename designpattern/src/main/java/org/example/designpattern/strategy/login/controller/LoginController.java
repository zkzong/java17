package org.example.designpattern.strategy.login.controller;


import org.example.designpattern.strategy.login.entity.LoginRequest;
import org.example.designpattern.strategy.login.strategy.LoginStrategy;
import org.example.designpattern.strategy.login.strategy.LoginStrategyFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @Author: zongz
 * @Date: 2025-12-21
 */
@RestController
@RequestMapping("/login")
public class LoginController {
    private final LoginStrategyFactory factory;

    @Autowired
    public LoginController(LoginStrategyFactory factory) {
        this.factory = factory;
    }

    @PostMapping
    public String login(@RequestBody LoginRequest request) {
        String loginType = request.getLoginType();
        Map<String, Object> params = request.getParams();
        LoginStrategy strategy = factory.getStrategy(loginType);
        return strategy.execute(params);
    }
}
