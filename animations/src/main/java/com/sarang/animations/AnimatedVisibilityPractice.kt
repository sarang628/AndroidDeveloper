package com.sarang.animations

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun Test() {
    var visible by remember { mutableStateOf(true) }
    Column(modifier = Modifier.height(200.dp), horizontalAlignment = Alignment.CenterHorizontally) {
        AnimatedVisibility(visible) {
            Box(modifier = Modifier.fillMaxWidth().height(100.dp).background(Color.Cyan))
        }
        Spacer(Modifier.height(10.dp))
        Box(Modifier.fillMaxWidth().height(100.dp).background(Color.Magenta).clickable(onClick = { visible = !visible }))
    }
}