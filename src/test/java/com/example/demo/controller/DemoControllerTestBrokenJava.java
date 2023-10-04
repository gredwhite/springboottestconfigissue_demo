package com.example.demo.controller;

import com.example.demo.app.DemoController;
import com.example.demo.app.DemoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@MyWebMvcTestJava(DemoController.class)
public class DemoControllerTestBrokenJava {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private DemoService demoService;

    @Test
    public void foo() throws Exception {
        when(demoService.getAll()).thenReturn(new String[]{"test1", "test2", "test3"});
        mockMvc.perform(get("/items"))
                .andExpect(status().isOk());
    }
}
