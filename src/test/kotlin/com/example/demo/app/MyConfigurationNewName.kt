package com.example.demo.app

import io.mockk.mockk
import org.springframework.boot.test.context.TestConfiguration
import org.springframework.context.annotation.Bean

@TestConfiguration
open class MyConfigurationNewName {
    @Bean
    open fun propertiesHolder(): PropertiesHolder = mockk()
}