package org.example.designpattern.strategy.season;

import org.springframework.stereotype.Component;

/**
 * @Author: zongz
 * @Date: 2025-12-27
 */
@Component("autumn")
public class AutumnStrategy implements SeasonsStrategy {
    @Override
    public String execute(String seasons) {
        return seasons + "来了！我们一起去看枫叶吧！";
    }
}
