package com.devgah.gasosa.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.devgah.gasosa.components.EthanolInput
import com.devgah.gasosa.components.GasolineInput
import com.devgah.gasosa.components.GasosaResult
import com.devgah.gasosa.components.GasosaTitle
import com.devgah.gasosa.ui.theme.Blue_Beaut

@Composable
fun Gasosa() {
    var priceGasoline by rememberSaveable { mutableStateOf("") }
    var priceEthanol by rememberSaveable { mutableStateOf("") }

    Column(
        Modifier
            .fillMaxSize()
            .background(color = Blue_Beaut),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            GasosaTitle()
            GasosaResult(priceEthanol, priceGasoline)
            GasolineInput(priceGasoline) { newValue ->
                priceGasoline = newValue
            }

            EthanolInput(priceEthanol) { newValue ->
                priceEthanol = newValue
            }
        }
    }
}