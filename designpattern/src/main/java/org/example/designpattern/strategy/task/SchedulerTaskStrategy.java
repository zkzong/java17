package org.example.designpattern.strategy.task;

/**
 * @Author: zongz
 * @Date: 2025-12-27
 */
public interface SchedulerTaskStrategy {
    void execute(SchedulerTaskDTO task);
    String getType();
}
