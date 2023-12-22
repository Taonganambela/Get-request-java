package com.zmltd.spring1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/integerNum")

public class AddIntController {

    @GetMapping("/Add/{Num1}/{Num2}")
    public int AddInt(@PathVariable("Num1") int  Num1, @PathVariable("Num2") int Num2){
        return Num1 + Num2;
    }

}
