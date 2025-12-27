package org.example.designpattern.strategy.calculator.command.strategy;

import org.springframework.stereotype.Component;

/**
 * @Author: zongz
 * @Date: 2025-12-27
 */
@Component
public class MultiCommand implements Command {

    @Override
    public String operateType() {
        return "multiply";
    }

    @Override
    public Integer execute(int a, int b) {
        return a * b;
    }
}
