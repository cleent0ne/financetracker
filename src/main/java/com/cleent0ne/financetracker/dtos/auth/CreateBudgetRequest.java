package com.cleent0ne.financetracker.dtos.auth;

import java.math.BigDecimal;

import com.cleent0ne.financetracker.enums.Category;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class CreateBudgetRequest {

    @NotNull
    private Category category;

    @NotNull
    private BigDecimal limitAmount;
}
