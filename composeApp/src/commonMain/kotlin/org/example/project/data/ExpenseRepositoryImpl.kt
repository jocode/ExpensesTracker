package org.example.project.data

import org.example.project.domain.ExpenseRepository
import org.example.project.domain.model.Expense
import org.example.project.domain.model.ExpenseCategory

class ExpenseRepositoryImpl(
    private val expenseManager: ExpenseManager
): ExpenseRepository {
    override suspend fun getExpenses(): List<Expense> {
        return expenseManager.fakeExpenseList
    }

    override suspend fun addExpense(expense: Expense) {
        expenseManager.addExpense(expense)
    }

    override suspend fun removeExpense(expense: Expense) {
        expenseManager.fakeExpenseList.remove(expense)
    }

    override suspend fun updateExpense(expense: Expense) {
        expenseManager.editExpense(expense)
    }

    override suspend fun getExpenseById(id: Long): Expense {
        return expenseManager.fakeExpenseList.first { it.id == id }
    }

    override suspend fun getCategoryExpenses(category: String): List<Expense> {
        return expenseManager.fakeExpenseList.filter { it.category.name == category }
    }

    override suspend fun getCategories(): List<ExpenseCategory> {
        return expenseManager.getCategories()
    }
}