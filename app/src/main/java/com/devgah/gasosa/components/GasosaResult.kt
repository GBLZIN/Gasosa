package com.devgah.gasosa.components

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
fun GasosaResult(priceEthanol: String, priceGasoline: String) {
    AnimatedVisibility(visible = priceEthanol.isNotBlank() && priceGasoline.isNotBlank()) {
        if (priceEthanol.isNotBlank() && priceGasoline.isNotBlank()) {
            val gasolineIsBetter = priceEthanol.toDouble() / priceGasoline.toDouble() > 0.7
            val result = if (gasolineIsBetter) "Gasolina" else "Álcool"
            val color = if (gasolineIsBetter) Color.Red else Color.Green

            Text(
                text = result,
                style = TextStyle(
                    color = color,
                    fontSize = 40.sp,
                    fontWeight = FontWeight.SemiBold
                )
            )
        }
    }
}