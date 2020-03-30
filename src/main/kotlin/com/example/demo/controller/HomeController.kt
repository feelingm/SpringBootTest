package com.example.demo.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/")
class HomeController {

    @GetMapping("")
    fun home(): Map<String, String> {
        val res = mutableMapOf<String, String>()
        res += "greet" to "Hello World"
        return res
    }

}