package com.cleent0ne.financetracker.dtos.auth;

import java.math.BigDecimal;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MonthlyReportResponse {

    private BigDecimal totalIncome;
    private BigDecimal totalExpenses;
    private BigDecimal balance;
    private double savingsRate;
    private String month;
}