package org.example.project

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import moe.tlaster.precompose.PreComposeApp
import moe.tlaster.precompose.flow.collectAsStateWithLifecycle
import moe.tlaster.precompose.viewmodel.viewModel
import org.example.project.data.ExpenseManager
import org.example.project.data.ExpenseRepositoryImpl
import org.example.project.presentation.ExpensesUiState
import org.example.project.presentation.ExpensesViewModel
import org.example.project.ui.ExpensesScreen
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    PreComposeApp {

        val colors = getColorsTheme()
        val viewModel = viewModel(modelClass = ExpensesViewModel::class) {
            ExpensesViewModel(ExpenseRepositoryImpl(ExpenseManager))
        }
        val uiState by viewModel.uiState.collectAsStateWithLifecycle()

        AppTheme {
            ExpensesScreen(
                modifier = Modifier.fillMaxSize(),
                uiState = uiState,
                onExpenseClick = {},
                onCategoryClick = {}
            )
        }
    }
}