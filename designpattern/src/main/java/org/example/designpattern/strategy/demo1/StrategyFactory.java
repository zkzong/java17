package org.example.designpattern.strategy.demo1;

import org.example.designpattern.strategy.demo1.service.StrategyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @Author: zongz
 * @Date: 2024/11/3
 */
@Component
public class StrategyFactory {

    // todo
    private final Map<String, StrategyService> strategyMap = null;

    @Autowired
    public StrategyFactory(List<StrategyService> strategyServices) {
         //this.strategyMap = strategyServices.stream()
         //        .collect(Collectors.toMap(Bean::getBeanName, Function.identity()));
    }

    public StrategyService getStrategy(String id) {
        return strategyMap.get(id);
    }
}
