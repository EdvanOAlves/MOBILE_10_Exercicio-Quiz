package com.example.mobile_10_exercicio_quiz.screens

import android.R.attr.contentDescription
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.PointerEventPass
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mobile_10_exercicio_quiz.R
import com.example.mobile_10_exercicio_quiz.components.ButtonYellow
import com.example.mobile_10_exercicio_quiz.components.QuestionCard
import com.example.mobile_10_exercicio_quiz.components.GreenDisplay

@Composable
fun QuizScreen(modifier: Modifier = Modifier, current:Int, final:Int) {
    Column(
        modifier =
            modifier
                .fillMaxSize()
                .background(Color(217, 103, 206, 255))
                .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(24.dp)
    ) {
        Image(
            modifier = Modifier
                .width(72.dp),
            painter = painterResource(R.drawable.parrot),
            contentDescription = "Mascote"
        )
        GreenDisplay(Modifier, "Pergunta $current de ${PointerEventPass.Final}")

        QuestionCard()
    }
}