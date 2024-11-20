package org.example.designpattern.strategy.price.strategy;

import org.example.designpattern.strategy.price.entity.Product;
import org.example.designpattern.strategy.price.entity.User;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * @Author: zongz
 * @Date: 2024-11-17
 */
@Component
public class VipDiscountStrategy implements PricingStrategy {
    @Override
    public BigDecimal calculatePrice(Product product, User user) {
        // 会员享受九折优惠
        return product.getPrice().multiply(new BigDecimal("0.9"));
    }
}
