package com.example.jetpack_compose.corecomponents

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import com.example.jetpack_compose.R

@Composable
fun ShowImage() {
    Image(
        painter = painterResource(id = R.drawable.pegussis),
        contentDescription = "pegussis"
    )
}