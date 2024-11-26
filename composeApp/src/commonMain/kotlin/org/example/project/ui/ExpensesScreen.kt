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
import org.example.project.getColorsTheme
import org.example.project.ui.components.ExpensesHeader
import org.example.project.ui.components.ExpensesTotalHeader

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun ExpensesScreen(
    modifier: Modifier = Modifier
) {
    val colors = getColorsTheme()

    LazyColumn(
        modifier = modifier.padding(horizontal = 16.dp, vertical = 16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        stickyHeader {
            Column(modifier = Modifier.background(colors.backgroundColor)) {
                ExpensesTotalHeader(
                    total = 100.0,
                    currency = "USD"
                )
                ExpensesHeader(
                    onButtonClick = {}
                )
            }
        }
        items(emptyList<String>()) {
            // Composable
        }
    }
}
