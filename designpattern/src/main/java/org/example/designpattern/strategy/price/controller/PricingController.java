package org.example.designpattern.strategy.price.controller;

import org.example.designpattern.strategy.price.entity.Product;
import org.example.designpattern.strategy.price.entity.User;
import org.example.designpattern.strategy.price.repository.ProductRepository;
import org.example.designpattern.strategy.price.repository.UserRepository;
import org.example.designpattern.strategy.price.strategy.PricingStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.Map;
import java.util.Optional;

/**
 * @Author: zongz
 * @Date: 2024-11-17
 */
@RestController
@RequestMapping("/pricing")
public class PricingController {

    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private Map<String, PricingStrategy> pricingStrategies;

    @GetMapping
    public ResponseEntity<BigDecimal> calculatePrice(@RequestParam Long productId, @RequestParam Long userId) {
        Optional<Product> productOpt = productRepository.findById(productId);
        Optional<User> userOpt = userRepository.findById(userId);

        if (productOpt.isPresent() && userOpt.isPresent()) {
            Product product = productOpt.get();
            User user = userOpt.get();
            PricingStrategy strategy = pricingStrategies.get(user.getUserType());
            if (strategy == null) {
                throw new IllegalArgumentException("Unsupported user type: " + user.getUserType());

            }
            BigDecimal price = strategy.calculatePrice(product, user);
            return ResponseEntity.ok(price);

        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
