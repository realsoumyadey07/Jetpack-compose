package com.example.jetpack_compose.fundamentalconcepts

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

// composable function

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun Greeting(){
    Text(
        text = "Hello World!"
    )
}