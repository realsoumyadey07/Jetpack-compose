package com.example.jetpack_compose.corecomponents

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.selection.DisableSelection
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.LinkAnnotation
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextLinkStyles
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withLink
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun PartiallySelectableText() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        contentAlignment = Alignment.Center
    ) {
        SelectionContainer { // this lets you select the text
            Column {
                Text("This is a text!")
                Text("This is a text!")
                Text("This is a text!")
                DisableSelection { // this prevents any text from selecting
                    Text("This is a text!")
                    Text("This is a text!")
                }
            }
        }
    }
}

@Composable
fun AnnotatedStringWithListenerSample(modifier: Modifier = Modifier) {
    val uriHandler = LocalUriHandler.current
    Text(
        buildAnnotatedString {
            append("Build better hybrid apps faster!")
            val link = LinkAnnotation.Url(
                "https://reactnative.dev/",
                TextLinkStyles(
                    SpanStyle(
                        color = Color.Blue
                    )
                )
            ){
                val url = (it as LinkAnnotation.Url).url
                uriHandler.openUri(url)
            }
            withLink(link) {
                append("React Native!")
            }
        }
    )
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Function() {
    AnnotatedStringWithListenerSample()
}