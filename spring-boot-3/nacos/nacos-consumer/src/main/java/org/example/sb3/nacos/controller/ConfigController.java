package org.example.sb3.nacos.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consumer")
@Slf4j
@RefreshScope
public class ConfigController {

    @Value("${nacos.config.name}")
    private String name;

    @GetMapping("/config")
    public String config() {
        log.info("name = {}", name);
        return name;
    }

}
