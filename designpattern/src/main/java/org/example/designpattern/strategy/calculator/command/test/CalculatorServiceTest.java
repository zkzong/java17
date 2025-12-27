package org.example.designpattern.strategy.calculator.command.test;

import jakarta.annotation.Resource;
import org.example.designpattern.strategy.calculator.command.CalculatorService;
import org.example.designpattern.strategy.calculator.command.CommandFactory;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/**
 * @Author: zongz
 * @Date: 2025-12-27
 */
@ExtendWith(SpringExtension.class)
@SpringBootTest
public class CalculatorServiceTest {

    @Resource
    private CalculatorService calculatorService;

    @Resource
    private CommandFactory commandFactory;

    @Test
    public void test1() {
        int result = calculatorService.calculate("add", 1, 2);
        System.out.println("result:" + result);
    }

    @Test
    public void test2() {
        int result = commandFactory.calculate("addCommand", 1, 2);
        System.out.println("result:" + result);
    }

}
