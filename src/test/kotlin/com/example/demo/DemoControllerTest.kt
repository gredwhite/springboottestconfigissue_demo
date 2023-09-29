package com.example.demo

import com.example.demo.app.MyConfiguration
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.context.annotation.Import

@SpringBootTest(
    webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT
)
@Import(MyConfiguration::class)
class DemoControllerTest {
    @Autowired
    lateinit var testRestTemplate: TestRestTemplate

    @Test
    fun getItems_success() {

    }
}