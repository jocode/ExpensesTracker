package org.example.project.ui

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import org.example.project.domain.model.Expense
import org.example.project.getColorsTheme
import org.example.project.presentation.ExpensesUiState
import org.example.project.ui.components.ExpenseItem
import org.example.project.ui.components.ExpensesHeader
import org.example.project.ui.components.ExpensesTotalHeader

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun ExpensesScreen(
    modifier: Modifier = Modifier,
    uiState: ExpensesUiState,
    onExpenseClick: (Expense) -> Unit,
    onCategoryClick: () -> Unit
) {
    val colors = getColorsTheme()

    LazyColumn(
        modifier = modifier.padding(horizontal = 16.dp, vertical = 16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        stickyHeader {
            Column(modifier = Modifier.background(colors.backgroundColor)) {
                ExpensesTotalHeader(
                    total = uiState.total,
                    currency = "USD"
                )
                ExpensesHeader(
                    onButtonClick = onCategoryClick
                )
            }
        }
        items(uiState.expenseList) { expense ->
            ExpenseItem(
                expense = expense,
                onExpenseClick = onExpenseClick
            )
        }
    }
}
