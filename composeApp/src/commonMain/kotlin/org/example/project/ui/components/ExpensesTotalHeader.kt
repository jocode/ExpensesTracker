package org.example.project.ui.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ExpensesTotalHeader(
    modifier: Modifier = Modifier,
    total: Double,
    currency: String
) {
    Card(shape = RoundedCornerShape(30), backgroundColor = Color.Black, elevation = 5.dp) {
        Box(
            modifier = modifier.fillMaxWidth().height(130.dp).padding(16.dp),
            contentAlignment = Alignment.CenterStart
        ) {
            Text(
                text = "$$total",
                fontSize = 30.sp,
                fontWeight = FontWeight.ExtraBold,
                color = Color.White
            )
            Text(
                modifier = Modifier.align(Alignment.CenterEnd),
                text = currency,
                color = Color.Gray
            )
        }
    }
}