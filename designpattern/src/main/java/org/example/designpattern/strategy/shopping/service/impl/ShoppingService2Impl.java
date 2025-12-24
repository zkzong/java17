package org.example.designpattern.strategy.shopping.service.impl;

import com.alibaba.fastjson2.JSON;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.example.designpattern.strategy.shopping.cache.MerchandiseCache;
import org.example.designpattern.strategy.shopping.cache.UserCache;
import org.example.designpattern.strategy.shopping.entity.Merchandise;
import org.example.designpattern.strategy.shopping.entity.User;
import org.example.designpattern.strategy.shopping.service.ShoppingService;
import org.example.designpattern.strategy.shopping.strategy.ShoppingStrategyAware;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 策略模式实现
 *
 */
@Slf4j
@Service("shoppingService2")
public class ShoppingService2Impl implements ShoppingService {

    @Resource
    private UserCache userCache;

    @Resource
    private MerchandiseCache merchandiseCache;

    @Resource(name = "normalStrategy")
    private ShoppingStrategyAware normalStrategy;

    @Resource(name = "VIPStrategy")
    private ShoppingStrategyAware vipStrategy;

    @Resource(name = "PVIPStrategy")
    private ShoppingStrategyAware pvipStrategy;

    @Resource(name = "EVIPStrategy")
    private ShoppingStrategyAware evipStrategy;

    @Resource(name = "SVIPStrategy")
    private ShoppingStrategyAware svipStrategy;

    /**
     * 购买商品
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
        // 普通用户
        if (user.getType() == 0) {
            return normalStrategy.buy(user, merchandise);
        } else
            // 普通VIP
            if (user.getType() == 1) {
                return vipStrategy.buy(user, merchandise);
            } else
                // 高级VIP
                if (user.getType() == 2) {
                    return pvipStrategy.buy(user, merchandise);
                } else
                    // 至尊VIP
                    if (user.getType() == 3) {
                        return evipStrategy.buy(user, merchandise);
                    } else
                        // 超级VIP
                        if (user.getType() == 4) {
                            return svipStrategy.buy(user, merchandise);
                        }
        return Map.of();
    }
}
