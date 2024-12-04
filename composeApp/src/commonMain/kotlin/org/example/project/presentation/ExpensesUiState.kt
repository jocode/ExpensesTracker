package org.example.project.presentation

import org.example.project.domain.model.Expense

data class ExpensesUiState(
    val expenseList: List<Expense> = emptyList(),
    val total: Double = 0.0,
)
