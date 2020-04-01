package com.example.demo.controller

import com.example.demo.model.User
import com.example.demo.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/users")
class UserController {

    @Autowired
    private lateinit var userService: UserService

    @GetMapping("")
    fun getAllUsers(): List<User> = userService.getAllUsers()

    @GetMapping("/{userid}")
    fun getUserByUserId(@PathVariable("userid") userId: Int): User = userService.getUserByUserId(userId)

    @PostMapping("")
    fun registerUser(@RequestBody user: User): User = userService.registerUser(user)

    @PutMapping("/{userid}")
    fun updateUser(@PathVariable("userid") userId: Int, @RequestBody user: User): User = userService.updateUser(userId, user)

    @DeleteMapping("/{userid}")
    fun removeUser(@PathVariable userId: Int): Unit = userService.removeUser(userId)
}