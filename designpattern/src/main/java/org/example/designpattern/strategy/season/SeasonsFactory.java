package org.example.designpattern.strategy.season;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @Author: zongz
 * @Date: 2025-12-27
 */
@Component
public class SeasonsFactory {
    @Autowired
    private Map<String, SeasonsStrategy> seasonsMap;

    /**
     * 根据 beanName 执行对应的策略
     *
     * @param seasons  当前季节
     * @param beanName 策略名称
     * @return 执行结果
     */
    public String handle(String seasons, String beanName) {
        SeasonsStrategy strategy = seasonsMap.get(beanName);
        if (strategy == null) {
            throw new IllegalArgumentException("策略不存在：" + beanName);
        }
        return strategy.execute(seasons);
    }
}
