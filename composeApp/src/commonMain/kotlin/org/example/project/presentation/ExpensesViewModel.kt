package org.example.project.presentation

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import moe.tlaster.precompose.viewmodel.ViewModel
import moe.tlaster.precompose.viewmodel.viewModelScope
import org.example.project.domain.ExpenseRepository
import org.example.project.domain.model.Expense

class ExpensesViewModel(
    private val repository: ExpenseRepository
) : ViewModel() {

    private val _uiState = MutableStateFlow(ExpensesUiState())
    val uiState = _uiState.asStateFlow()

    private var allExpenses: List<Expense> = emptyList()

    init {
        getAllExpenses()
    }

    private fun getAllExpenses() {
        viewModelScope.launch {
            allExpenses = repository.getExpenses()
            _uiState.update { state ->
                state.copy(expenseList = allExpenses, total = allExpenses.sumOf { it.amount })
            }
        }
    }

    fun addExpense(expense: Expense) {
        viewModelScope.launch {
            repository.addExpense(expense)
        }
        getAllExpenses()
    }

    fun editExpense(expense: Expense) {
        viewModelScope.launch {
            repository.updateExpense(expense)
        }
        getAllExpenses()
    }

    fun removeExpense(expense: Expense) {
        viewModelScope.launch {
            repository.removeExpense(expense)
        }
        getAllExpenses()
    }

    fun getExpenseById(id: Long): Expense {
        return allExpenses.first { it.id == id }
    }
}