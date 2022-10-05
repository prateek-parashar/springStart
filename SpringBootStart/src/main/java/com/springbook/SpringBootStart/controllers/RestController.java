package com.springbook.SpringBootStart.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping("/restHello")
    public String restHello() {
        return "Hello world!";
    }

}
