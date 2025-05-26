package com.example.jetpack_compose.fundamentalconcepts

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpack_compose.R

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ShowUi(){
//    AccessStringResource()
    AccessImageResource()
}

@Composable
fun AccessStringResource() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = stringResource(R.string.Fruits),
            color = colorResource(R.color.orange)
        )

    }
}

@Composable
fun AccessImageResource(){
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        Image(
            painter = painterResource(R.drawable.pegussis),
            contentDescription = "pegussis"
        )
    }
}