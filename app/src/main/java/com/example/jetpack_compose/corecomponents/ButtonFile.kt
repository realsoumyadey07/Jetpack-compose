package com.example.jetpack_compose.corecomponents

import android.widget.Toast
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview

// filled button
@Composable
fun FilledButtonSample() {
    val context = LocalContext.current
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
//        Button( // normal button
//            onClick = {
//                Toast.makeText(context, "Button is clicked!", Toast.LENGTH_LONG).show()
//            }
//        ) {
//            Text("Filled Button")
//        }
        // tonal button
//        FilledTonalButton(
//            onClick = {
//                Toast.makeText(context, "Tonnal button is clicked!", Toast.LENGTH_SHORT).show()
//            }
//        ) {
//            Text("Tonnal Button")
//        }

        // outlined button
//        OutlinedButton(
//            onClick = {
//                Toast.makeText(context, "Tonnal button is clicked!", Toast.LENGTH_SHORT).show()
//            }
//        ) {
//            Text("Outlined Button!")
//        }
        //elevated button
//        ElevatedButton(
//            onClick = {
//                Toast.makeText(context, "Elevated button is clicked!", Toast.LENGTH_SHORT).show()
//            }
//        ) {
//            Text("Elevated Button")
//        }

        //text button
        TextButton(
            onClick = {

            }
        ) {
            Text("Text Button")
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Previews() {
    FilledButtonSample()
}