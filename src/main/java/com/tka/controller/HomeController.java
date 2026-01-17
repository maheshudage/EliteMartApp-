package com.tka.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tka.service.ProductService;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "OK";
    }
}

