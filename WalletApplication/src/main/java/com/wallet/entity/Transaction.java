package com.wallet.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String userId;

    private Double amount;

    private String type; // CREDIT / DEBIT

    private String description;

    private LocalDateTime timestamp;

    // Getters and Setters
}