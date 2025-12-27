package org.example.designpattern.strategy.calculator.operation;

/**
 * @Author: zongz
 * @Date: 2025-12-27
 */
public class AddOperation implements Operation {

    @Override
    public int execute(int a, int b) {
        return a + b;
    }
}
