package com.example.pastelfarms.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/")
    public String showIndex() {
        return "index";
    }

    @GetMapping("/home")
    public String GoHome(){
        return "index";
    }

    @GetMapping("/ourStory")
    public String showAbout() {
        return "ourStory";
    }
}
