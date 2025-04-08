package com.mao.service.impl;

import com.mao.api.service.HelloService;
import org.springframework.stereotype.Service;

/**
 * Implementation of HelloService
 */
@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return "Hello, " + name + "!";
    }
}