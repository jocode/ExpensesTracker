package org.example.project

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import moe.tlaster.precompose.PreComposeApp
import org.example.project.ui.ExpensesScreen
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    PreComposeApp {

        val colors = getColorsTheme()

        AppTheme {
            ExpensesScreen(
                modifier = Modifier.fillMaxSize(),
                onExpenseClick = {}
            )
        }
    }
}