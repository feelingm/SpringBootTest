package com.example.demo.service

import org.springframework.stereotype.Service

@Service
class UserService {

    fun getMessage(): Map<String, String> {
        val res = mutableMapOf<String, String>()
        res += "greet" to "hello world"
        return res
    }

}