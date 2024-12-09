package org.example.strategy.simplefactory;

import org.example.strategy.CashNormal;
import org.example.strategy.CashRebate;
import org.example.strategy.CashReturn;
import org.example.strategy.CashSuper;

/**
 * @Author: zongz
 * @Date: 2024-12-09
 */
public class CashFactory {

    // 收费工厂
    public static CashSuper createCashAccept(int cashType) {
        CashSuper cs = null;
        switch (cashType) {
            case 1:
                // 正常收费
                cs = new CashNormal();
                break;
            case 2:
                // 打八折
                cs = new CashRebate(0.8d);
                break;
            case 3:
                // 打七折
                cs = new CashRebate(0.7d);
                break;
            case 4:
                // 满300返100
                cs = new CashReturn(300d, 100d);
                break;
        }
        return cs;
    }

}
