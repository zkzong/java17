package org.example.designpattern.strategy.price.strategy;

import org.example.designpattern.strategy.price.entity.Product;
import org.example.designpattern.strategy.price.entity.User;

import java.math.BigDecimal;

/**
 * @Author: zongz
 * @Date: 2024-11-17
 */
public interface PricingStrategy {

    BigDecimal calculatePrice(Product product, User user);

}
