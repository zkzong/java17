package org.example.sb3.apollo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@Slf4j
public class TestController {

    @Value("${apollo.config.name}")
    private String name;

    @GetMapping("/config")
    public String config() {
        log.info("name = {}", name);
        return name;
    }

}
