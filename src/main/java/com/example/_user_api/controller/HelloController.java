package com.example._user_api.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String getHello(){
        return "Hello Awais";
    }
}
