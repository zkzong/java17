package org.example.designpattern.strategy.calculator.operation;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * @Author: zongz
 * @Date: 2025-12-27
 */
public class OperatorFactory {

    private static Map<String, Operation> operationMap = new HashMap<>();

    static {
        //初始化实现类
        operationMap.put("add", new AddOperation());
        operationMap.put("sub", new SubOperation());
        operationMap.put("multi", new MultiOperation());
        operationMap.put("div", new DivOperation());
        // more operators
    }

    /**
     * 获取对应的目标实现类
     *
     * @param operator
     * @return
     */
    public static Optional<Operation> getOperation(String operator) {
        return Optional.ofNullable(operationMap.get(operator));
    }

}
