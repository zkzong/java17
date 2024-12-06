package org.example.sb3.nacos.controller;

import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.example.sb3.nacos.ProviderClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consumer")
@Slf4j
@RefreshScope
public class ConsumerController {

    @Resource
    private ProviderClient providerClient;

    @PostMapping("/post")
    public String post(@RequestParam String name) {
        log.info("name = {}", name);
        return providerClient.post(name);
    }

}
