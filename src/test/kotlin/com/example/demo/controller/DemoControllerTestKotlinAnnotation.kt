package com.example.demo.controller

import com.example.demo.app.DemoController
import com.example.demo.app.DemoService
import org.junit.jupiter.api.Test
import org.mockito.kotlin.whenever
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.mock.mockito.MockBean
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.get

@MyWebMvcTestKotlin(DemoController::class)
class DemoControllerTestKotlinAnnotation {

    @Autowired
    private lateinit var mockMvc: MockMvc

    @MockBean
    private lateinit var demoService: DemoService

    @Test
    fun foo() {
        whenever(demoService.getAll()).thenReturn(arrayOf("test1", "test2", "test3"))
        mockMvc.get("/items")
            .andExpect { status { isOk() } }
    }
}