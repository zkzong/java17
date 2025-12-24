package org.example.designpattern.strategy.shopping.entity;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

/**
 * 商品实体类
 *
 * @Author: zongz
 * @Date: 2025-12-24
 */
@Data
@Builder
public class Merchandise {

    /**
     * 商品ID
     */
    private Long id;

    /**
     * 商品名称
     */
    private String name;

    /**
     * 商品价格
     */
    private BigDecimal price;

}
