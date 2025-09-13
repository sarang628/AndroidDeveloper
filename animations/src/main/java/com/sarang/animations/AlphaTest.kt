package com.sarang.animations

import android.R.attr.clickable
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun AlphaTest() {
    var visible by remember { mutableStateOf(true) }
    val animatedAlpha by animateFloatAsState(targetValue = if (visible) 1.0f else 0.2f, label = "alpha")
    Box(
        modifier = Modifier
            .size(200.dp)
            .graphicsLayer { alpha = animatedAlpha }
            .clip(RoundedCornerShape(8.dp))
            .background(Color.Green)
    ) {
    }
    Button({ visible = !visible }) {
        Text("Alpha")
    }
}