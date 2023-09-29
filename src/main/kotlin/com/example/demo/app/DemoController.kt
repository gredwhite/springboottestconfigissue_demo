package com.example.demo.app

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class DemoController(
    private val demoService: DemoService
) {

    @GetMapping("/items")
    fun getAll(): Array<String> {
        return demoService.getAll()
    }
}