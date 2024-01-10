package com.example._user_api.controller;

import org.springframework.web.bind.annotation.*;
@RestController
public class NamesController {


        @GetMapping("/names")
        public String getname(){
            return "My name is Awais";
        }
        @PostMapping("/names")
        public String Postname(){
            return "My name is Awais";
        }

        @PutMapping("/names")
        public String putname(){
            return "Update your name";
        }
        @DeleteMapping("/names")
        public String Deletename(){
            return "Delete your name";
        }

    }
