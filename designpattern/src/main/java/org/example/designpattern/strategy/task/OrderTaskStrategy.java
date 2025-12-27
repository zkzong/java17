package org.example.designpattern.strategy.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * 订单任务
 *
 * @Author: zongz
 * @Date: 2025-12-27
 */
@Component
public class OrderTaskStrategy implements SchedulerTaskStrategy {

    private static final Logger logger = LoggerFactory.getLogger(OrderTaskStrategy.class);

    @Override
    public void execute(SchedulerTaskDTO task) {
        logger.info("执行订单任务: {}", task);
        System.out.println("订单任务 ");
    }

    @Override
    public String getType() {
        return "order_task";
    }
}
