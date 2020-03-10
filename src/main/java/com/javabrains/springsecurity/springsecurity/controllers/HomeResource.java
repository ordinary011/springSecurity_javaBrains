package com.javabrains.springsecurity.springsecurity.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {

    @GetMapping("/")
    public String name(){
        return ("<h1>hi</h1>");
    }

    @GetMapping("/user")
    public String user(){
        return ("<h1>hi user</h1>");
    }

    @GetMapping("/admin")
    public String admin(){
        return ("<h1>hi admin</h1>");
    }
}
