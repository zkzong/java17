package org.example.designpattern.strategy.task;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/**
 * @Author: zongz
 * @Date: 2025-12-27
 */
@ExtendWith(SpringExtension.class)
@SpringBootTest
public class TaskTest {

    @Resource
    private SchedulerTask schedulerTask;

    @Test
    public void testTaskOrder() {
        // 创建订单任务DTO
        SchedulerTaskDTO taskOrder = new SchedulerTaskDTO();
        taskOrder.setId(1L);
        taskOrder.setType("order_task");  // 确保类型与策略匹配

        // 使用订单任务策略执行任务
        schedulerTask.handle(taskOrder);

        System.out.println("Order Task Executed: " + taskOrder);

        // 创建司机任务DTO
        SchedulerTaskDTO taskDriver = new SchedulerTaskDTO();
        taskDriver.setId(2L);
        taskDriver.setType("driver_task");  // 确保类型与策略匹配

        // 使用司机任务策略执行任务
        schedulerTask.handle(taskDriver);

        System.out.println("Driver Task Executed: " + taskDriver);
    }

}
