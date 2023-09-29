package com.example.demo.app

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties(prefix = "my.props")
data class MyProperties(
    val prop1: String,
    val prop2: String,
    val prop3: String
)
