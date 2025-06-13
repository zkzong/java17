package org.example.sb3.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.example.sb3.pojo.springdoc.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zong
 */
@Slf4j
@RestController
@RequestMapping("/springdoc")
@Tag(name = "SpringDoc", description = "SpringDoc测试类")
public class SpringDocController {

    @Operation(summary = "查询用户信息")
    @PostMapping("/test")
    public String test(@RequestBody User user) {
        return user.toString();
    }

}
