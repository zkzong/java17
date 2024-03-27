package org.example.sb3.nacos.controller;

import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.example.sb3.nacos.TestApi;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@Slf4j
@RefreshScope
public class TestController {

    @Resource
    private TestApi testApi;

    @Value("${nacos.config.name}")
    private String name;

    @PostMapping("/post")
    public String post(@RequestParam String name) {
        log.info("name = {}", name);
        return testApi.post(name);
    }

    @GetMapping("/config")
    public String config() {
        log.info("name = {}", name);
        return name;
    }

}
