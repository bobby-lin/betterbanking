package com.betterbanking.betterbanking.service;

import com.betterbanking.betterbanking.model.Transaction;

import java.util.ArrayList;
import java.util.List;

public class TransactionService {
    public List<Transaction> findAllByAccountNumber(String accountNumber) {
        List<Transaction> list = new ArrayList<Transaction>();
        list.add(new Transaction("Transport", accountNumber, "SGD",
                2.00, "SMRT", "smrt.jpeg"));
        return list;
    }

}
