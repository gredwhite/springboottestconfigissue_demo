package com.example.demo.controller

import com.example.demo.app.JacksonConfig
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.context.annotation.Import
import org.springframework.core.annotation.AliasFor
import kotlin.reflect.KClass

@Retention(AnnotationRetention.RUNTIME)
@WebMvcTest
@AutoConfigureMockMvc(addFilters = false)
@Import(
    JacksonConfig::class
)
annotation class MyWebMvcTestKotlin(
    @get:AliasFor(
        annotation = WebMvcTest::class,
        attribute = "controllers"
    ) vararg val value: KClass<*> = []
)
