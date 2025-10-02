package com.devgah.gasosa.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
fun GasosaTitle() {
    Text(
        text = "Álcool ou Gasolina?",
        style = TextStyle(
            color = Color.White,
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold
        )
    )
}