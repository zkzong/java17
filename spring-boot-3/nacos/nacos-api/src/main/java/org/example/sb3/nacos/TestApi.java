package org.example.sb3.nacos;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "nacos-provider")
public interface TestApi {

    @PostMapping("/test/post")
    String post(@RequestParam String name);

}
