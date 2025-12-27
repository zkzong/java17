package org.example.designpattern.strategy.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * 司机任务
 *
 * @Author: zongz
 * @Date: 2025-12-27
 */
@Component
public class DriverTaskStrategy implements SchedulerTaskStrategy {

    private static final Logger logger = LoggerFactory.getLogger(DriverTaskStrategy.class);

    @Override
    public void execute(SchedulerTaskDTO task) {
        logger.info("执行司机任务: {}", task);
        System.out.println("司机任务");
    }

    @Override
    public String getType() {
        return "driver_task";
    }
}
