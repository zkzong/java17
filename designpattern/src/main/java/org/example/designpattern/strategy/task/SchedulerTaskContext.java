package org.example.designpattern.strategy.task;

/**
 * @Author: zongz
 * @Date: 2025-12-27
 */
public class SchedulerTaskContext {

    private SchedulerTaskStrategy strategy;

    public SchedulerTaskContext(SchedulerTaskStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(SchedulerTaskStrategy strategy) {
        this.strategy = strategy;
    }

    public void executeTask(SchedulerTaskDTO task) {
        strategy.execute(task);
    }
}
