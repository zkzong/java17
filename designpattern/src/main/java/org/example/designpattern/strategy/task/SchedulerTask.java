package org.example.designpattern.strategy.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author: zongz
 * @Date: 2025-12-27
 */
@Component
public class SchedulerTask {

    private static final Logger logger = LoggerFactory.getLogger(SchedulerTask.class);

    private final SchedulerTaskStrategyFactory strategyFactory;

    @Autowired
    public SchedulerTask(SchedulerTaskStrategyFactory strategyFactory) {
        this.strategyFactory = strategyFactory;
    }

    public void handle(SchedulerTaskDTO task) {

        SchedulerTaskStrategy strategy = getStrategy(task.getType());
        if (strategy == null) {
            logger.error("任务类型错误 {}", task.getType());
            throw new IllegalArgumentException("任务类型错误");
        }
        SchedulerTaskContext context = new SchedulerTaskContext(strategy);
        context.executeTask(task);
    }

    /**
     * 获取策略
     */
    private SchedulerTaskStrategy getStrategy(String taskType) {
        SchedulerTaskStrategy strategy = strategyFactory.getStrategy(taskType);
        if (strategy == null) {
            logger.warn("未知的任务类型: {}", taskType);
        }
        return strategy;
    }
}
