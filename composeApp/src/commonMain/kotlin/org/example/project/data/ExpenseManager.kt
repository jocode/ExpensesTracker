package org.example.project.data

import org.example.project.domain.model.Expense
import org.example.project.domain.model.ExpenseCategory

object ExpenseManager {

    private var currentId = 1L

    val fakeExpenseList = mutableListOf(
        Expense(
            id = currentId++,
            amount = 100.0,
            currency = "USD",
            category = ExpenseCategory.GROCERIES,
            description = "Buy ice cream"
        ),
        Expense(
            id = currentId++,
            amount = 10.0,
            currency = "USD",
            category = ExpenseCategory.SNACKS,
            description = "Burger King"
        ),
        Expense(
            id = currentId++,
            amount = 20.0,
            currency = "USD",
            category = ExpenseCategory.CAR,
            description = "Gasoline"
        ),
        Expense(
            id = currentId++,
            amount = 100.0,
            currency = "USD",
            category = ExpenseCategory.HOUSE,
            description = "Buy a new chair"
        ),
        Expense(
            id = currentId++,
            amount = 5.0,
            currency = "USD",
            category = ExpenseCategory.COFFEE,
            description = "Coffee on Starbucks"
        ),
        Expense(
            id = currentId++,
            amount = 150.0,
            currency = "USD",
            category = ExpenseCategory.PARTY,
            description = "Party with friends"
        )
    )

    fun addExpense(expense: Expense) {
        fakeExpenseList.add(expense.copy(id = currentId++))
    }

    fun editExpense(expense: Expense) {
        val index = fakeExpenseList.indexOfFirst { it.id == expense.id }

        if (index != -1) fakeExpenseList[index] = expense
    }

    fun getCategories() = listOf(
        ExpenseCategory.GROCERIES,
        ExpenseCategory.HOUSE,
        ExpenseCategory.SNACKS,
        ExpenseCategory.CAR,
        ExpenseCategory.COFFEE,
        ExpenseCategory.PARTY,
        ExpenseCategory.OTHER
    )
}
