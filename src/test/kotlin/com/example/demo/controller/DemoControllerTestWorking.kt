package com.example.demo.controller

import com.example.demo.app.DemoController
import com.example.demo.app.DemoService
import com.example.demo.app.JacksonConfig
import org.junit.jupiter.api.Test
import org.mockito.kotlin.whenever
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.boot.test.mock.mockito.MockBean
import org.springframework.context.annotation.Import
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.get

@WebMvcTest(controllers = [DemoController::class])
@AutoConfigureMockMvc(addFilters = false)
@Import(JacksonConfig::class)
class DemoControllerTestWorking {

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