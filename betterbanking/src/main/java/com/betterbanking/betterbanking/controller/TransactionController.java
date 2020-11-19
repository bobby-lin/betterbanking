package com.betterbanking.betterbanking.controller;

import com.betterbanking.betterbanking.model.Transaction;
import com.betterbanking.betterbanking.service.TransactionService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path="/transactions", produces={"application/json"})
@CrossOrigin(origins="*")
public class TransactionController {

    @GetMapping(path="/{accountNumber}")
    public List<Transaction> getTransaction(@PathVariable("accountNumber") String accountNumber) {
        TransactionService service = new TransactionService();
        return service.findAllByAccountNumber(accountNumber);
    }
}
