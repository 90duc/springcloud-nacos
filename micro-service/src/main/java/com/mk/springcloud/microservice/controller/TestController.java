package com.mk.springcloud.microservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public String test(){
        return "hello world";
    }

    @GetMapping("/micro/test")
    public String test1(){
        return "hello world /";
    }
}
