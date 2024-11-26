package org.example.project.ui.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.example.project.getColorsTheme

@Composable
fun ExpensesHeader(
    modifier: Modifier = Modifier,
    onButtonClick: () -> Unit
) {
    val colors = getColorsTheme()

    Row(
        modifier = modifier.padding(vertical = 16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = "All Expenses",
            modifier = Modifier.weight(1f),
            fontWeight = FontWeight.ExtraBold,
            fontSize = 20.sp,
            color = colors.textColor
        )
        Button(
            onClick = onButtonClick,
            shape = RoundedCornerShape(50),
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color.LightGray
            ),
            enabled = false
        ) {
            Text(
                text = "View All"
            )
        }
    }
}