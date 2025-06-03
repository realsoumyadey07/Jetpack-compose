package com.example.jetpack_compose.corecomponents

import androidx.compose.foundation.basicMarquee
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun SampleText() {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Text(
            "Hello jetpack compose",
            color = Color.Blue,
            fontSize = 30.sp,
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.Bold,
            style = TextStyle(
                shadow = Shadow(color = Color.Black, blurRadius = 20f)
            )
        )
    }
}

// linear gradient text style
@Composable
fun ColorFullText() {
    val rainbow = listOf<Color>(
        Color.Blue,
        Color.Cyan,
        Color.Green,
        Color.Yellow,
        Color.Red,
        Color.Magenta
    )
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Text(text = buildAnnotatedString {
            append("Do not allow people to dim your shine \n")
            withStyle(
                SpanStyle(
                    brush = Brush.linearGradient(rainbow)
                )
            ) {
                append("Cause they are blinded")
            }
            append("\ntell them to put sunglasses")
        })
    }
}

@Composable
fun ScrollableText() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "Hay this is soumya, experimenting with jetpack compose".repeat(50),
            maxLines = 2,
//            modifier = Modifier.basicMarquee(),
            fontSize = 40.sp,
            overflow = TextOverflow.Ellipsis // to denote there is further text
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TextAndTypography() {
    ScrollableText()
}