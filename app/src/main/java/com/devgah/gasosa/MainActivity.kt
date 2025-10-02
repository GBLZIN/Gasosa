package com.devgah.gasosa

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.devgah.gasosa.screen.Gasosa
import com.devgah.gasosa.ui.theme.GasosaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GasosaTheme {
                Gasosa()
            }
        }
    }
}