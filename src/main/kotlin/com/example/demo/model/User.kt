package com.example.demo.model

import org.springframework.web.bind.annotation.RequestParam

data class User(@RequestParam("userid") var userId: Int?, @RequestParam("username") var userName: String?)