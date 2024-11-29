package org.example.project.domain

import org.example.project.domain.model.Expense
import org.example.project.domain.model.ExpenseCategory

interface ExpenseRepository {
    suspend fun getExpenses(): List<Expense>
    suspend fun addExpense(expense: Expense)
    suspend fun removeExpense(expense: Expense)
    suspend fun updateExpense(expense: Expense)
    suspend fun getExpenseById(id: Long): Expense
    suspend fun getCategoryExpenses(category: String): List<Expense>
    suspend fun getCategories(): List<ExpenseCategory>
}