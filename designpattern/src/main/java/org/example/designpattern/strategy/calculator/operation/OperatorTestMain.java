package org.example.designpattern.strategy.calculator.operation;

/**
 * @Author: zongz
 * @Date: 2025-12-27
 */
public class OperatorTestMain {

    public static void main(String[] args) {
        //获取计算的目标实现类
        Operation targetOperation = OperatorFactory
                .getOperation("add")
                .orElseThrow(() -> new IllegalArgumentException("Invalid Operator"));
        int result = targetOperation.execute(1, 2);
        System.out.println("result:" + result);
    }

}
