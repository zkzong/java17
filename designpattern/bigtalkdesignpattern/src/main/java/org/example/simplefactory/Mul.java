package org.example.simplefactory;

/**
 * @Author: zongz
 * @Date: 2024-12-01
 */
public class Mul extends Operation {
    @Override
    public double getResult(double numberA, double numberB) {
        return numberA * numberB;
    }
}
