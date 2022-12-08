package com.codewithisa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/second-controller")
public class SecondController {

    @GetMapping("/test1")
    public String test1() {
        System.out.println("second controller is executed");
        return "second controller is executed";
    }
}
