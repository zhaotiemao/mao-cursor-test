package com.mao.controller;

import com.mao.api.model.Result;
import com.mao.api.service.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private final HelloService helloService;

    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping("/hello")
    public Result<String> hello(@RequestParam(defaultValue = "World") String name) {
        return Result.success(helloService.sayHello(name));
    }
}