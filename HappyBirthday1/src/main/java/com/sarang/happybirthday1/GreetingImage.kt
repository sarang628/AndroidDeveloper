package com.sarang.happybirthday1

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview


@Composable
fun GreetingImage(message: String, from: String) {
    val image = painterResource(R.drawable.androidparty)

    Image(
        painter = image, contentDescription = null
    )
}

@Preview(showBackground = true)
@Composable
fun BirthdayCardPreview() {
    GreetingImage(
        message = "Happy Birthday Sam!",
        from = "From Emma"
    )
}