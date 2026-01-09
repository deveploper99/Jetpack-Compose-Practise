package com.example.textviewproperty.JetpackCompose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.textviewproperty.Text

@Composable
@Preview(showSystemUi = true)

fun modifier(){

    Column(
        modifier = Modifier
            .fillMaxHeight(0.5f)
            .width(300.dp)
            .background(color = Color.Red)
            .padding(horizontal = 30.dp, vertical = 40.dp)

    ) {

        Text( text= "Rassel Hassan", modifier = Modifier,
            fontWeight = FontWeight.Black,
            color = Color.White,
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.displayLarge

        )
        Spacer(modifier = Modifier.size(20.dp))
        Text( text= "Rassel Hassan")
    }
}