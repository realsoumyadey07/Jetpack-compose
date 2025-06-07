package com.example.jetpack_compose

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController


@Composable
fun LoginUi(navController: NavController) {
    var userName by remember { mutableStateOf("") }
    var userPassword by remember { mutableStateOf("") }
    var userEmail by remember { mutableStateOf("") }
    val context = LocalContext.current
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("Welcome to MAKAUT", style = MaterialTheme.typography.headlineMedium)
        OutlinedTextField(
            value = userName,
            onValueChange = {
                userName = it
            },
            placeholder = {
                Text("Enter the username...")
            },
            label = {
                Text("Username")
            },
            modifier = Modifier.fillMaxWidth(),
            singleLine = true,
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Text
            ),
            leadingIcon = {
                Icon(imageVector = Icons.Default.AccountCircle, contentDescription = "username")
            }
        )
        Spacer(modifier = Modifier.padding(7.dp))
        OutlinedTextField(
            value = userEmail,
            onValueChange = {
                userEmail = it
            },
            placeholder = {
                Text("Enter the email...")
            },
            label = {
                Text("Email")
            },
            modifier = Modifier.fillMaxWidth(),
            singleLine = true,
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Email
            ),
            leadingIcon = {
                Icon(imageVector = Icons.Default.Email, contentDescription = "email")
            }
        )
        Spacer(modifier = Modifier.padding(7.dp))
        OutlinedTextField(
            value = userPassword,
            onValueChange = {
                userPassword = it
            },
            placeholder = {
                Text("Enter the password...")
            },
            label = {
                Text("Password")
            },
            modifier = Modifier.fillMaxWidth(),
            singleLine = true,
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Password
            ),
            leadingIcon = {
                Icon(imageVector = Icons.Default.Info, contentDescription = "password")
            }
        )
        Spacer(modifier = Modifier.padding(7.dp))
        Button(
            modifier = Modifier.fillMaxWidth(),
            onClick = {
                /* TODO */
                if (userName == "" || userPassword == "" || userEmail == "") {
                    Toast.makeText(context, "Please fill all fields", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(context, "Welcome $userName", Toast.LENGTH_LONG).show()
                    navController.navigate(routes.Details)
                }
            }
        ) {
            Text("Register")
        }
    }
}