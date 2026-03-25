package com.example.mobile_10_exercicio_quiz.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.mobile_10_exercicio_quiz.R
import com.example.mobile_10_exercicio_quiz.components.ButtonYellow

@Composable
fun StartScreen(modifier: Modifier = Modifier, navController: NavController) {
    Column(
        modifier =
            modifier
                .fillMaxSize()
                .background(Color.Cyan)
                .padding(horizontal = 36.dp, vertical = 72.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(24.dp)
    ) {
        Image(
            modifier = Modifier,

            painter = painterResource(R.drawable.parrot),
            contentDescription = "Mascote"
        )
        Text(
            text = "Quiz dos bom de Terraria",
            fontSize = 36.sp)
        ButtonYellow(Modifier, "COMECAR!", onClick = {navController.navigate("quiz")})
    }


}