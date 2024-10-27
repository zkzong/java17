package org.example.sb3.controller;

import org.example.sb3.pojo.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 使用WebMvcConfigurer
 *
 * @Author: zongz
 * @Date: 2024/10/27
 */
@RestController
@RequestMapping("/web")
public class WebController {

    @RequestMapping("/user")
    public ResponseEntity<User> user() {
        User user = User.builder().id(1L).userName("Java").build();
        return ResponseEntity.ok(user);
    }

}
