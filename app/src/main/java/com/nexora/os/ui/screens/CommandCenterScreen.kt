package com.nexora.os.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.nexora.os.ui.components.AiCore
import com.nexora.os.ui.theme.*

@Composable
fun CommandCenterScreen(){
    Box(
        Modifier.fillMaxSize().background(Bg).padding(24.dp)
    ){
        Column(Modifier.fillMaxSize()){

            Text("NEXORA", color=Text, fontSize=30.sp)
            Text("SYSTEM ONLINE • NX-01", color=Cyan, fontSize=11.sp)

            Spacer(Modifier.height(36.dp))

            Box(
                Modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center
            ){
                AiCore()
            }

            Spacer(Modifier.height(30.dp))

            Box(
                Modifier.fillMaxWidth()
                    .height(56.dp)
                    .background(Color(0x16FFFFFF), RoundedCornerShape(28.dp))
                    .padding(horizontal=20.dp),
                contentAlignment = Alignment.CenterStart
            ){
                Text("Ask NEXORA Anything...", color=Text)
            }

            Spacer(Modifier.height(28.dp))

            Text("MISSION 024", color=Gold, fontSize=10.sp)
            Spacer(Modifier.height(6.dp))
            Text("Command Center initialized", color=Text)

            Spacer(Modifier.weight(1f))

            Box(
                Modifier.fillMaxWidth()
                    .height(60.dp)
                    .background(Color(0x14000000), RoundedCornerShape(30.dp)),
                contentAlignment = Alignment.Center
            ){
                Text("N", color=Cyan, fontSize=24.sp)
            }
        }
    }
}
