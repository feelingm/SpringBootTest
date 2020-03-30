package com.example.demo.service

import com.example.demo.model.User
import org.springframework.stereotype.Service

@Service
class UserService {

    fun getMessage(): Map<String, String> {
        val res = mutableMapOf<String, String>()
        res += "greet" to "hello world"
        return res
    }

    fun getAllUsers(): List<User> {

    }

    fun getUserByUserId(userId: Int): User {

    }

    fun registerUser(user: User): User {

    }


}