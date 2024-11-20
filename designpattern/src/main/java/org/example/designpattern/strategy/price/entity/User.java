package org.example.designpattern.strategy.price.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

/**
 * @Author: zongz
 * @Date: 2024-11-17
 */
@Entity(name = "user")
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "user_name")
    private String username;
    // e.g., VIP, Regular
    @Column(name = "user_type")
    private String userType;

}
