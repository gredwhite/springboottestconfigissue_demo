package com.example.demo.app

import org.springframework.stereotype.Repository

@Repository
class DemoRepository(
    private val propertiesHolder: PropertiesHolder
) {
    fun getAll(): Array<String> {
        return propertiesHolder.props
    }
}