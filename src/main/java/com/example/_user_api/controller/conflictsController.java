package com.example._user_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class conflictsController {
@GetMapping("/conflicts")
    public String getConflicts(){
    return"Getting conflicts";
}


}
