package com.zmltd.spring1.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/authenticate")

public class ClassOne {
    // define route with parameters
    @GetMapping("/login/{userName}/{password}")

    public String getUserDetails(@PathVariable("userName") String userName, @PathVariable("password") String password) {
        return userName + " " + password;
    }
}
