package com.nexora.os.ui.components

import androidx.compose.animation.core.*
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun AiCore() {
    val t = rememberInfiniteTransition(label="core")
    val breathe by t.animateFloat(
        0.95f,1.05f,
        infiniteRepeatable(tween(3000), RepeatMode.Reverse),
        label="breathe"
    )

    Box(Modifier.size(180.dp), contentAlignment = Alignment.Center){
        Box(
            Modifier.size(170.dp)
                .scale(breathe)
                .background(
                    Brush.radialGradient(
                        listOf(Color(0x447CEBFF), Color.Transparent)
                    ),
                    CircleShape
                )
        )
        Box(
            Modifier.size(128.dp)
                .background(
                    Brush.linearGradient(
                        listOf(Color.White, Color(0xFFC4D0DB), Color(0xFF5A6670))
                    ),
                    CircleShape
                )
        )
        Box(Modifier.size(168.dp).border(1.dp, Color(0xFFD6B169), CircleShape))
        Box(Modifier.size(148.dp).border(1.dp, Color(0xFF7CEBFF), CircleShape))
    }
}
