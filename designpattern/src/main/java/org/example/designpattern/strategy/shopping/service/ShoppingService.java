package org.example.designpattern.strategy.shopping.service;

import java.util.Map;

/**
 * 购物服务
 *
 */
public interface ShoppingService {

    /**
     * 购买
     *
     * @param userId        用户ID
     * @param merchandiseId 商品ID
     * @return 购买结果
     */
    Map<String, Object> buy(Long userId, Long merchandiseId);
}
