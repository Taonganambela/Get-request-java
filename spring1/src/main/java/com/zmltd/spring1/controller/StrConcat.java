package com.zmltd.spring1.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/concatination")

public class StrConcat {

    @GetMapping("/string/{age}")

    public String getUserDetails(@PathVariable("age") int age) {

        // return "I am " + age + " years olds";
        return String.format(" I am %d years old %d", age,age);

    }
}
