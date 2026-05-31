package com.cleent0ne.financetracker.dtos.budget;

import java.math.BigDecimal;
import java.util.UUID;

import com.cleent0ne.financetracker.enums.Category;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BudgetResponse {

    private UUID id;
    private Category category;
    private BigDecimal limitAmount;
}
