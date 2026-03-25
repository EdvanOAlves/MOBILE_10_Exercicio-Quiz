package com.example.mobile_10_exercicio_quiz.screens

import android.widget.MediaController
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
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
import com.example.mobile_10_exercicio_quiz.components.GreenDisplay
import com.example.mobile_10_exercicio_quiz.components.MediumText

@Composable
fun ResultScreen(modifier: Modifier = Modifier, navController: NavController) {
    Column(
        modifier =
            modifier
                .fillMaxSize()
                .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(24.dp)
    ) {
        Image(
            modifier = Modifier
                .width(72.dp),
            painter = painterResource(R.drawable.parrot),
            contentDescription = "Mascote"
        )
        Column(
            Modifier
                .background(Color(88, 195, 255, 255))
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            Spacer(modifier = Modifier.height(24.dp))
            GreenDisplay(Modifier, "Bom trabalho!")
            Spacer(modifier = Modifier.height(24.dp))
            MediumText(Modifier, "Você acertou 1 de 3 perguntas")
            Spacer(modifier = Modifier.height(24.dp))
        }
        ButtonYellow(Modifier, "JOGAR NOVAMENTE", {})
    }


}