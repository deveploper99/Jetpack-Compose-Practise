package com.example.textviewproperty

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
@Preview(showSystemUi = true)
fun Text(){

    Text(text = "My name amar sonar bangala ami tomay valo vabi cirodine tumi je amar kdfkdfjdkfjdkf kdfjkdfj" ,
       color = MaterialTheme.colorScheme.onBackground,
        fontStyle = FontStyle.Italic,
        fontWeight = FontWeight.Black,
        fontFamily = FontFamily.Monospace,
        letterSpacing = 5.sp,
        textAlign = TextAlign.Center,
        maxLines = 2,
        lineHeight = 43.sp,
        overflow = TextOverflow.Ellipsis,
        style = MaterialTheme.typography.bodyMedium



    )
}