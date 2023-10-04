package com.example.demo.app

import com.fasterxml.jackson.databind.ObjectMapper
import org.openapitools.jackson.nullable.JsonNullableModule
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder

@Configuration
open class JacksonConfig {

    @Bean
    open fun jackson2ObjectMapperBuilder(): Jackson2ObjectMapperBuilder =
        Jackson2ObjectMapperBuilder.json()
            .modules(
                JsonNullableModule(),
            )

    @Bean
    open fun objectMapper(): ObjectMapper =
        jackson2ObjectMapperBuilder().build()
}