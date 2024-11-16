package org.example.designpattern.strategy.demo1.service.impl;

import org.example.designpattern.strategy.demo1.service.StrategyService;
import org.springframework.stereotype.Service;

/**
 * @Author: zongz
 * @Date: 2024/11/3
 */
@Service("firstStrategy")
public class FirstStrategyServiceImpl implements StrategyService {
    @Override
    public String process(String data) {
        // 处理逻辑
        return "Processed by FirstStrategy: " + data;
    }
}
