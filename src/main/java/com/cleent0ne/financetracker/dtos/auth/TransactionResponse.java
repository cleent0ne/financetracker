package com.cleent0ne.financetracker.dtos.auth;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

import com.cleent0ne.financetracker.enums.Category;
import com.cleent0ne.financetracker.enums.TransactionType;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TransactionResponse {

    private UUID id;
    private BigDecimal amount;
    private TransactionType type;
    private Category category;
    private String description;
    private LocalDate date;
}