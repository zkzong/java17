package org.example.designpattern.strategy.price.repository;

import org.example.designpattern.strategy.price.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author: zongz
 * @Date: 2024-11-17
 */
public interface UserRepository extends JpaRepository<User, Long> {
}
