package org.example.designpattern.strategy.demo1.controller;

/**
 * @Author: zongz
 * @Date: 2024/11/3
 */

import org.example.designpattern.strategy.demo1.StrategyFactory;
import org.example.designpattern.strategy.demo1.service.StrategyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/strategy")
public class StrategyController {

    @Autowired
    private StrategyFactory factory;

    @GetMapping("/{id}")
    public String executeStrategy(@PathVariable String id, @RequestParam String data) {
        StrategyService service = factory.getStrategy(id);
        if (service == null) {
            throw new IllegalArgumentException("No strategy found for id: " + id);
        }
        return service.process(data);
    }
}
