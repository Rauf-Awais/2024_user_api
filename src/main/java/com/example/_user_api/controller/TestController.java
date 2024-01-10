package com.example._user_api.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class TestController {
    @GetMapping("/test")
    public String getTest(){
        return "In main Branch";
    }

}
