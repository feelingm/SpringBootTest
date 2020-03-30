package com.example.demo.controller

import com.example.demo.model.User
import com.example.demo.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/users")
class UserController {

    @Autowired
    private lateinit var userService: UserService

    @GetMapping("")
    fun getAllUsers(): List<User> = userService.getAllUsers()

    @GetMapping("/userid")
    fun getUserByUserId(userId: Int): User = userService.getUserByUserId(userId)

    @PostMapping("")
    fun registerUser(user: User): User = userService.registerUser(user)
}