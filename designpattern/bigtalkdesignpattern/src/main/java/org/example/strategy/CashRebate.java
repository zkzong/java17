package org.example.strategy;

/**
 * @Author: zongz
 * @Date: 2024-12-09
 */
public class CashRebate extends CashSuper {

    private double moneyRebate = 1d;

    // 打折收费。初始化时必需输入折扣率。八折就输入0.8
    public CashRebate(double moneyRebate) {
        this.moneyRebate = moneyRebate;
    }

    // 计算收费时需要在原价基础上乘以折扣率
    @Override
    public double acceptCash(double price, int num) {
        return price * num * this.moneyRebate;
    }
}
