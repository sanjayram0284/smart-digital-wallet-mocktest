package com.wallet.service;

import com.wallet.entity.Transaction;
import com.wallet.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class TransactionService {

    @Autowired
    private TransactionRepository repository;

    public Transaction createTransaction(Transaction transaction) {
        transaction.setTimestamp(LocalDateTime.now());
        return repository.save(transaction);
    }

    public List<Transaction> getUserTransactions(String userId) {
        return repository.findByUserId(userId);
    }

    public Double getBalance(String userId) {
        List<Transaction> list = repository.findByUserId(userId);

        double balance = 0;

        for (Transaction t : list) {
            if (t.getType().equalsIgnoreCase("CREDIT")) {
                balance += t.getAmount();
            } else {
                balance -= t.getAmount();
            }
        }

        return balance;
    }
}