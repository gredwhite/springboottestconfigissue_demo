package com.example.demo.app

import io.mockk.mockk
import org.springframework.boot.test.context.TestConfiguration
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Primary

@TestConfiguration
open class MyConfigurationTest {
    @Bean
    @Primary
    open fun propertiesHolder(): PropertiesHolder = mockk()
}