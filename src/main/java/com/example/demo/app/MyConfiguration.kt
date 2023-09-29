package com.example.demo.app

import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
@EnableConfigurationProperties(MyProperties::class)
open class MyConfiguration(
    private val myProperties: MyProperties
) {
    @Bean
    open fun propertiesHolder(): PropertiesHolder {
        return PropertiesHolder(arrayOf(myProperties.prop1, myProperties.prop2, myProperties.prop3))
    }
}