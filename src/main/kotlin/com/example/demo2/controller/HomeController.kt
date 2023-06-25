package com.example.demo2.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HomeController {
    @GetMapping("/")
    fun home() : String {
        return "Hello World Sonar Test"
    }
}
