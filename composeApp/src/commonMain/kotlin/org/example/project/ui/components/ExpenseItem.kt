package org.example.project.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.example.project.domain.model.Expense
import org.example.project.getColorsTheme

@Composable
fun ExpenseItem(
    modifier: Modifier = Modifier,
    expense: Expense,
    onExpenseClick: (Expense) -> Unit
) {
    val colors = getColorsTheme()

    Card(
        modifier = modifier.fillMaxWidth().padding(horizontal = 2.dp).clickable {
            onExpenseClick(expense)
        },
        backgroundColor = colors.backgroundColor,
        shape = RoundedCornerShape(30)
    ) {
        Row(
            modifier = Modifier.padding(horizontal = 8.dp, vertical = 16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Surface(
                modifier = Modifier.size(50.dp),
                shape = RoundedCornerShape(35),
                color = colors.purple
            ) {
                Image(
                    modifier = Modifier.padding(10.dp),
                    imageVector = expense.icon,
                    colorFilter = ColorFilter.tint(Color.White),
                    contentScale = ContentScale.Crop,
                    contentDescription = expense.description
                )
            }
            Column(
                modifier = Modifier.weight(1f).padding(start = 8.dp)
            ) {
                Text(
                    text = expense.category.name,
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 18.sp,
                    color = colors.textColor
                )
                Text(
                    text = expense.description,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 15.sp,
                    color = Color.Gray
                )
            }

            Text(
                text = "$${expense.amount}",
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                color = colors.textColor
            )
        }
    }
}