package org.example.designpattern.strategy.shopping.service.impl;

import com.alibaba.fastjson2.JSON;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.example.designpattern.strategy.shopping.cache.MerchandiseCache;
import org.example.designpattern.strategy.shopping.cache.UserCache;
import org.example.designpattern.strategy.shopping.entity.Merchandise;
import org.example.designpattern.strategy.shopping.entity.User;
import org.example.designpattern.strategy.shopping.factory.ShoppingFactory;
import org.example.designpattern.strategy.shopping.service.ShoppingService;
import org.example.designpattern.strategy.shopping.strategy.ShoppingStrategyAware;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 工厂 + 策略模式实现
 *
 */
@Slf4j
@Service("shoppingService3")
public class ShoppingService3Impl implements ShoppingService {

    @Resource
    private ShoppingFactory shoppingFactory;

    @Resource
    private UserCache userCache;

    @Resource
    private MerchandiseCache merchandiseCache;

    /**
     * 购买
     *
     * @param userId        用户ID
     * @param merchandiseId 商品ID
     * @return 购买结果
     */
    @Override
    public Map<String, Object> buy(Long userId, Long merchandiseId) {
        User user = userCache.get(userId);
        Merchandise merchandise = merchandiseCache.get(merchandiseId);
        log.info("current user: {}", JSON.toJSONString(user));
        log.info("current merchandise: {}", JSON.toJSONString(merchandise));
        ShoppingStrategyAware strategy = shoppingFactory.getStrategy(user.getType());
        return strategy.buy(user, merchandise);
    }
}
