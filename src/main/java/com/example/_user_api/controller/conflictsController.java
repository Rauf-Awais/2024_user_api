package com.example._user_api.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class conflictsController {
@GetMapping("/conflicts")
    public String getConflicts(){
    return"Getting conflicts";
}
@PostMapping("/conflicts")
    public String postConflicts(){
    return "Posting Conflicts";

}
@DeleteMapping("/conflicts")
    public String deleteConflicts(){
    return " Deleting Conflicts";
}

}
