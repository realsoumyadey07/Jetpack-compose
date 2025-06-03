package com.example.jetpack_compose.corecomponents

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun SampleOutlinedTextFieldSample() {
    var text: String by remember {
        mutableStateOf("")
    }
    val rainbowColors = listOf<Color>(
        Color.Blue,
        Color.Red,
        Color.Yellow,
        Color.Cyan,
        Color.Green,
        Color.Magenta
    )
    val brush = remember {
        Brush.linearGradient(
            colors = rainbowColors
        )
    }
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
//        TextField(
//            value = text,
//            onValueChange = {
//                text = it
//            },
//            textStyle = TextStyle(brush = brush)
//        )
        OutlinedTextField(
            value = text,
            onValueChange = {
                text = it
            },
            label = {
                Text("Email")
            },
            placeholder = {
                Text("Enter your email...")
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            textStyle = TextStyle(brush = brush)
        )
    }
}

// text with password
@Composable
fun PasswordTextFieldSample(modifier: Modifier = Modifier) {
    var password by rememberSaveable {
        mutableStateOf("")
    }
    Box(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        contentAlignment = Alignment.Center
    ){
        OutlinedTextField(
            value = password,
            onValueChange = {
                password = it
            },
            label = {
                Text("Password")
            },
            placeholder = {
                Text("Enter password here...")
            },
            visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Password
            ),
            modifier = Modifier.fillMaxWidth()
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Functions() {
    PasswordTextFieldSample()
}