package org.example.project.previews

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import org.example.project.data.ExpenseManager
import org.example.project.presentation.ExpensesUiState
import org.example.project.ui.ExpensesScreen
import org.example.project.ui.components.ExpenseItem
import org.example.project.ui.components.ExpensesHeader
import org.example.project.ui.components.ExpensesTotalHeader

@Preview(showBackground = true)
@Composable
fun ExpensesTotalHeaderPreview() {
    ExpensesTotalHeader(
        total = 100.0,
        currency = "USD"
    )
}

@Preview(showBackground = true)
@Composable
fun ExpensesHeaderPreview() {
    ExpensesHeader(
        onButtonClick = {}
    )
}

@Preview(showBackground = true)
@Composable
fun ExpenseItemPreview(modifier: Modifier = Modifier) {
    ExpenseItem(
        expense = ExpenseManager.fakeExpenseList.first(),
        onExpenseClick = {}
    )
}

@Preview(showBackground = true)
@Composable
fun ExpenseScreenPreview(modifier: Modifier = Modifier) {
    ExpensesScreen(
        uiState = ExpensesUiState(
            expenseList = ExpenseManager.fakeExpenseList,
            total = ExpenseManager.fakeExpenseList.sumOf { it.amount }
        ),
        onExpenseClick = {},
        onCategoryClick = {}
    )
}
