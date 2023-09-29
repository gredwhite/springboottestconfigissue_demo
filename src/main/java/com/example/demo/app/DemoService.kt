package com.example.demo.app

import org.springframework.stereotype.Service

@Service
class DemoService(
    private val demoRepository: DemoRepository
) {
    fun getAll(): Array<String> {
        return demoRepository.getAll()
    }
}