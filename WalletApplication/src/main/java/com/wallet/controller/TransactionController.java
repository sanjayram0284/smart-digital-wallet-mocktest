package com.wallet.controller;

import com.wallet.dto.TransactionRequest;
import com.wallet.entity.Transaction;
import com.wallet.service.TransactionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/transactions")
@CrossOrigin
public class TransactionController {

    @Autowired
    private TransactionService service;

    // Add Transaction
    @PostMapping("/add")
    public Transaction addTransaction(@RequestBody TransactionRequest request) {

        Transaction t = new Transaction();
        t.setUserId(request.getUserId());
        t.setAmount(request.getAmount());
        t.setType(request.getType());
        t.setDescription(request.getDescription());

        return service.createTransaction(t);
    }

    // Get History
    @GetMapping("/{userId}")
    public List<Transaction> getTransactions(@PathVariable String userId) {
        return service.getUserTransactions(userId);
    }

    // Get Balance
    @GetMapping("/balance/{userId}")
    public Double getBalance(@PathVariable String userId) {
        return service.getBalance(userId);
    }
}