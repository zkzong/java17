package org.example.designpattern.strategy.season;

import lombok.extern.slf4j.Slf4j;
import org.example.designpattern.strategy.shopping.domain.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zongz
 * @Date: 2025-12-27
 */
@Slf4j
@RestController
@RequestMapping("/season")
public class SeasonController {
    @Autowired
    private SeasonsFactory seasonsFactory;

    @GetMapping("/strategyTest/{seasons}/{beanName}")
    public Result strategyTest(@PathVariable String seasons, @PathVariable String beanName) {
        String result = seasonsFactory.handle(seasons, beanName);
        return Result.success(result);
    }
}
