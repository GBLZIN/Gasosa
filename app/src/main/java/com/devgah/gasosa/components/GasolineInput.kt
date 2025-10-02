package com.devgah.gasosa.components

import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType

@Composable
fun GasolineInput(
    priceGasoline: String,
    onPriceGasolineChange: (String) -> Unit
) {
    TextField(
        value = priceGasoline,
        onValueChange = { newValue ->
            if (newValue.length <= 6) {
                onPriceGasolineChange(newValue)
            }
        },
        label = {
            Text(
                text = "Gasolina (R$)",
                color = Color.White
            )
        },
        singleLine = true,
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
        trailingIcon = {
            Icon(
                Icons.Filled.ShoppingCart,
                contentDescription = "Gasoline",
                tint = Color.White
            )
        },
        colors = OutlinedTextFieldDefaults.colors(
            unfocusedContainerColor = Color.LightGray,
            focusedContainerColor = Color.LightGray,
            unfocusedTextColor = Color.Black,
            focusedTextColor = Color.Black,
            cursorColor = Color.Black,
            focusedBorderColor = Color.LightGray,
            unfocusedBorderColor = Color.LightGray
        )
    )
}