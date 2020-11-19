package com.betterbanking.betterbanking;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestComponent;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
public class TransactionControllerIntegrationTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void TransactionComponentTest() throws Exception {
        this.mockMvc.perform(get("/transactions/abc123"));
    }

    @Test
    public void shouldReturnStatus200() throws Exception {
        this.mockMvc.perform(get("/transactions/abc123")).andExpect(status().isOk());
    }

    @Test
    public void shouldReturnStatus404() throws Exception {
        this.mockMvc.perform(get("/transactions/")).andExpect(status().isNotFound());
    }
}
