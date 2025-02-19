package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Dev {

    @RequestMapping("/")
    public String hello(){
        return "Hello World, Welcome to SpringBoot";
    }
}
