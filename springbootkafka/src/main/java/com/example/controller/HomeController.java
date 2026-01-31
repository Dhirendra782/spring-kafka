package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hellos")
public class HomeController {

    @GetMapping
    public String hello() {
        return "Hello Spring Boot Kafka";
    }

}
