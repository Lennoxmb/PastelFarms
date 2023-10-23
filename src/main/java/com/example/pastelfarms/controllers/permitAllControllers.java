package com.example.pastelfarms.controllers;

import org.springframework.web.bind.annotation.GetMapping;

public class permitAllControllers {

    @GetMapping("/")
    public String showContact() {
        return "index";
    }

    @GetMapping("/about")
    public String showAbout() {
        return "about";
    }
}
