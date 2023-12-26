package org.example.sb3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zong
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/get")
    public String get() {
        return "success";
    }

    @PostMapping("/post")
    public String post() {
        return "success";
    }

}
