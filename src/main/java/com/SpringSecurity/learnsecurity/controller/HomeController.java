package com.SpringSecurity.learnsecurity.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    
    @GetMapping("/index")
    public String sayHi(){
        return "Hi spring security  using UserDetailManager !!" ;
    }
}
