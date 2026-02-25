package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class csecontroller {

    @GetMapping("/home")
    public String rocks() {
        return "Welcome to jenkins aws";
    }

    @GetMapping("/cse")
    public String rocks1() {
        return "Welcome to third cse";
    }
    
    @GetMapping("/adityacse")
    public String rocks2() {
        return "i am batman";
    }
}