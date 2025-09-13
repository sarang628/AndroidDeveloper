package com.sarang.animations

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun AnimationBackground() {
    var animateBackgroundColor by remember { mutableStateOf(false) }
    val animatedColor by animateColorAsState(if (animateBackgroundColor) Color.Green else Color.Blue, label = "color", animationSpec = tween(durationMillis = 500))
    Column(modifier = Modifier.fillMaxWidth().height(400.dp).drawBehind { drawRect(animatedColor) }) {
        Button({animateBackgroundColor = !animateBackgroundColor}) { Text("Change")}
    }
}