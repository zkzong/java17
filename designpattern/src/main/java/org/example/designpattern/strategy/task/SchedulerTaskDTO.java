package org.example.designpattern.strategy.task;

import lombok.Data;
import lombok.ToString;

/**
 * @Author: zongz
 * @Date: 2025-12-27
 */
@Data
@ToString
public class SchedulerTaskDTO {

    private Long id;

    // 任务类型
    private String type;
}
