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
public class RegularDiscountStrategy implements PricingStrategy {
    @Override
    public BigDecimal calculatePrice(Product product, User user) {
        // 普通用户无折扣
        return product.getPrice();
    }
}
