package org.example.designpattern.strategy.calculator.command;

import org.example.designpattern.strategy.calculator.command.strategy.Command;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author: zongz
 * @Date: 2025-12-27
 */
@Component
public class CalculatorService implements ApplicationContextAware {

    private Map<String, Command> commandMap = new ConcurrentHashMap<>();


    /**
     * 执行计算
     *
     * @param operateType
     * @param a
     * @param b
     * @return
     */
    public int calculate(String operateType, int a, int b) {
        Command targetCommand = Optional.ofNullable(commandMap.get(operateType))
                .orElseThrow(() -> new IllegalArgumentException("Invalid Operator"));
        return targetCommand.execute(a, b);
    }


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        Map<String, Command> tempMap = applicationContext.getBeansOfType(Command.class);
        tempMap.values().forEach(source -> commandMap.put(source.operateType(), source));
    }

}
