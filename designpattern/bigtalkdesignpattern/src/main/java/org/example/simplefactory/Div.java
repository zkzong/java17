package org.example.simplefactory;

/**
 * @Author: zongz
 * @Date: 2024-12-01
 */
public class Div extends Operation {
    @Override
    public double getResult(double numberA, double numberB) {
        if (numberB == 0) {
            System.out.println("除数不能为0");
            throw new ArithmeticException();
        }
        return numberA / numberB;
    }
}
