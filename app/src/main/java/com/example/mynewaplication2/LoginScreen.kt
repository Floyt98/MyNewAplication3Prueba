package com.example.mynewaplication2

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Esto es un ejemplo",
        modifier = modifier
    )
}