package org.example.designpattern.strategy.login.strategy;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: zongz
 * @Date: 2025-12-21
 */
@Component
public class LoginStrategyFactory {

    private final Map<String, LoginStrategy> strategyMap;

    // 通过Spring依赖注入获取所有LoginStrategy实现类
    //public LoginStrategyFactory(Map<String, LoginStrategy> strategyMap) {
    //    this.strategyMap = strategyMap;
    //}

    // 修改工厂类的构造方法，建立正确映射
    public LoginStrategyFactory(Map<String, LoginStrategy> strategyMap) {
        this.strategyMap = new HashMap<>();
        strategyMap.forEach((beanName, strategy) ->
                this.strategyMap.put(strategy.getLoginType(), strategy)
        );
    }

    public LoginStrategy getStrategy(String loginType) {
        LoginStrategy strategy = strategyMap.get(loginType);
        if (strategy == null) {
            throw new IllegalArgumentException("不支持的登录类型：" + loginType);
        }
        return strategy;
    }
}
