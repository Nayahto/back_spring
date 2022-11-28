package com.nayahto.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")

public class Controller {

    @GetMapping("all")
    public String helloworld() {
        return "helloworld";
    }

}
