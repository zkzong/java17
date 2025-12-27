package org.example.designpattern.strategy.calculator.command.strategy;

/**
 * @Author: zongz
 * @Date: 2025-12-27
 */
public interface Command {

    /**
     * 命令类型
     *
     * @return
     */
    String operateType();

    /**
     * 执行
     *
     * @param a
     * @param b
     * @return
     */
    Integer execute(int a, int b);

}
