package com.example.pastelfarms.controllers;

import org.springframework.web.bind.annotation.GetMapping;

public class UserController {

    @GetMapping("/")
    public String showIndex() {
        return "index";
    }

    @GetMapping("/home")
    public String GoHome(){
        return "index";
    }

    @GetMapping("/about")
    public String showAbout() {
        return "about";
    }
}
