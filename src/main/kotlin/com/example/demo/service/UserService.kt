package com.example.demo.service

import com.example.demo.dao.UserRepository
import com.example.demo.model.User
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserService {

    @Autowired
    private lateinit var userRepository: UserRepository

    fun getMessage(): Map<String, String> {
        val res = mutableMapOf<String, String>()
        res += "greet" to "hello world"
        return res
    }

    fun getAllUsers(): List<User> = userRepository.getAllUsers()

    fun getUserByUserId(userId: Int): User = userRepository.getUserByUserId(userId)

    fun registerUser(user: User): User = userRepository.insertUser(user)

    fun updateUser(userId: Int, user: User): User {
        user.userId = userId
        return userRepository.updateUser(user)
    }

    fun removeUser(userId: Int) {
        userRepository.removeUser(userId)
    }
}