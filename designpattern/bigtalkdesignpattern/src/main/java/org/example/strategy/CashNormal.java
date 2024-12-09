package org.example.strategy;

/**
 * @Author: zongz
 * @Date: 2024-12-09
 */
public class CashNormal extends CashSuper {
    // 正常收费，原价返回
    @Override
    public double acceptCash(double price, int num) {
        return price * num;
    }
}
