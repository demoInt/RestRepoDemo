package org.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/")
public class TestController {

    @GetMapping("/home")
    public String getHome(){
        return "This is homepage";
    }

    @GetMapping("/house`")
    public String getHome2(){
        return "This is homepage 2";
    }
}
