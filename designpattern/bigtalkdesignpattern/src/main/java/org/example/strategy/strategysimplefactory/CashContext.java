package org.example.strategy.strategysimplefactory;

import org.example.strategy.CashNormal;
import org.example.strategy.CashRebate;
import org.example.strategy.CashReturn;
import org.example.strategy.CashSuper;

/**
 * @Author: zongz
 * @Date: 2024-12-09
 */
public class CashContext {

    // 声明一个CashSuper对象
    private CashSuper cs;

    // 通过构造方法，传入具体的收费策略
    public CashContext(int cashType) {
        switch (cashType) {
            case 1:
                this.cs = new CashNormal();
                break;
            case 2:
                this.cs = new CashRebate(0.8d);
                break;
            case 3:
                this.cs = new CashRebate(0.7d);
                break;
            case 4:
                this.cs = new CashReturn(300d, 100d);
                break;
        }
    }

    public double getResult(double price, int num) {
        // 根据收费策略的不同，获得计算结果
        return this.cs.acceptCash(price, num);
    }
}
