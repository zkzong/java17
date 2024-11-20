package org.example.designpattern.strategy.price.repository;

import org.example.designpattern.strategy.price.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author: zongz
 * @Date: 2024-11-17
 */
public interface ProductRepository extends JpaRepository<Product, Long> {
}
