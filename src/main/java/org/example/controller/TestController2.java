package org.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController2 {
    @GetMapping("/home")
    public String getHome(){
        return "This is homepage FROM CONTROLLER 2";
    }
}
