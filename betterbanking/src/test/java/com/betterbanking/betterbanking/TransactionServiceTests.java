package com.betterbanking.betterbanking;

import com.betterbanking.betterbanking.service.TransactionService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class TransactionServiceTests {

    @DisplayName("Test Transaction Service - findAllByAccountNumber()")
    @Test
    void testFindAllByAccountNumber() {
        TransactionService transactionService = new TransactionService();
        assertTrue(transactionService.findAllByAccountNumber("anvc").size() > 0,
                "There should be more than 0 account in the list");
    }
}
