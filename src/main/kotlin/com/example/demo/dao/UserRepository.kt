package com.example.demo.dao

import com.example.demo.model.User
import org.springframework.stereotype.Repository

@Repository
class UserRepository {

    companion object {
        val users = mutableListOf<User>()
    }

    init {
        users += User(100, "a")
        users += User(200, "b")
        users += User(300, "c")
        users += User(400, "d")
    }

    fun getMessage(): Map<String, String> {
        val res = mutableMapOf<String, String>()
        res += "greet" to "hello world"
        return res
    }

    fun getAllUsers(): List<User> = users

    fun getUserByUserId(userId: Int): User {
        return users.firstOrNull { it.userId == userId } ?: User(0, "No User")
    }

    fun insertUser(user: User): User {
        users.add(user)

        return user
    }

    fun updateUser(user: User): User {
        return user
    }

    fun removeUser(userId: Int) {
        users.removeIf { user -> user.userId == userId }
    }
}