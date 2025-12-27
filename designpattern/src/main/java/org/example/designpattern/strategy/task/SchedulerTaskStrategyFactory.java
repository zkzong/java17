package org.example.designpattern.strategy.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author: zongz
 * @Date: 2025-12-27
 */
@Component
public class SchedulerTaskStrategyFactory {

    private final Map<String, SchedulerTaskStrategy> strategyMap;

    private static final Logger logger = LoggerFactory.getLogger(SchedulerTaskStrategyFactory.class);

    @Autowired
    public SchedulerTaskStrategyFactory(List<SchedulerTaskStrategy> strategies) {
        strategyMap = new ConcurrentHashMap<>();
        for (SchedulerTaskStrategy strategy : strategies) {
            logger.info("Registered strategy: {}", strategy.getType());
            strategyMap.put(strategy.getType(), strategy);
        }
    }

    public SchedulerTaskStrategy getStrategy(String taskType) {
        return strategyMap.get(taskType);
    }
}
