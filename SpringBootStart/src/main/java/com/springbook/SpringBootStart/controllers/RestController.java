package com.springbook.SpringBootStart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RestController {

    @RequestMapping("/restHello")
    @ResponseBody
    public String restHello() {
        return "Hello world!";
    }

}
