package org.example.designpattern.strategy.calculator.operation;

/**
 * @Author: zongz
 * @Date: 2025-12-27
 */
public interface Operation {
    /**
     * 执行计算
     *
     * @param a
     * @param b
     * @return
     */
    int execute(int a, int b);
}
