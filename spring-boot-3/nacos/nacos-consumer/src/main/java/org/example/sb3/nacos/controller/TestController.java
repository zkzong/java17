package org.example.sb3.nacos.controller;

import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.example.sb3.nacos.TestApi;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@Slf4j
public class TestController {

    @Resource
    private TestApi testApi;

    @PostMapping("post")
    public String post(@RequestParam String name) {
        log.info("name = {}", name);
        return testApi.post(name);
    }

}
