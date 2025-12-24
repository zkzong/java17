package org.example.designpattern.strategy.shopping.strategy;

import org.example.designpattern.strategy.shopping.entity.Merchandise;
import org.example.designpattern.strategy.shopping.entity.User;
import org.example.designpattern.strategy.shopping.enums.DiscountEnum;

import java.util.Map;

/**
 * @Author: zongz
 * @Date: 2024-11-17
 */
public interface ShoppingStrategyAware {

    /**
     * 返回应享折扣枚举
     *
     * @return 折扣
     */
    DiscountEnum getStrategy();

    /**
     * 购买
     *
     * @param user        用户
     * @param merchandise 商品
     * @return 结果
     */
    Map<String, Object> buy(User user, Merchandise merchandise);

}
