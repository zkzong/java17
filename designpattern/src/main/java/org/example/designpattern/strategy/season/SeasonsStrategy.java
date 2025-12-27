package org.example.designpattern.strategy.season;

/**
 * 四季策略接口
 *
 * @Author: zongz
 * @Date: 2025-12-27
 */
public interface SeasonsStrategy {
    /**
     * 执行策略方法
     *
     * @param seasons 当前季节
     * @return 执行结果
     */
    String execute(String seasons);
}
