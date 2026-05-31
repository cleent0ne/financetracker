package com.cleent0ne.financetracker.dtos.transaction;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.math.BigDecimal;

import com.cleent0ne.financetracker.enums.TransactionType;

@Data
public class CreateTransactionRequest {

    @NotNull
    private BigDecimal amount;

    @NotNull
    private TransactionType type;

    @NotBlank
    private String description;
}
