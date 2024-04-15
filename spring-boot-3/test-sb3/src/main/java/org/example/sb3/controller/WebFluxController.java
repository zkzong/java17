package org.example.sb3.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * @author zong
 */
@Slf4j
@RestController
@RequestMapping("/webflux")
public class WebFluxController {

    @GetMapping("/get")
    public Mono<String> get() {
        log.info("get");
        return Mono.just("success");
    }

    @PostMapping("/post")
    public String post() {
        log.info("post");
        return "success";
    }

}
