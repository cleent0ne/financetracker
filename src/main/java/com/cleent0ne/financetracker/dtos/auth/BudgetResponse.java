package com.cleent0ne.financetracker.dtos.auth;

import java.math.BigDecimal;

import com.cleent0ne.financetracker.enums.Category;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BudgetResponse {

    private Long id;
    private Category category;
    private BigDecimal limitAmount;
}
