package org.example.project.previews

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import org.example.project.domain.model.Expense
import org.example.project.domain.model.ExpenseCategory
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
        expense = expenseFake,
        onExpenseClick = {}
    )
}

val expenseFake = Expense(
    id = 1,
    amount = 100.0,
    currency = "USD",
    category = ExpenseCategory.GROCERIES,
    description = "Description"
)
