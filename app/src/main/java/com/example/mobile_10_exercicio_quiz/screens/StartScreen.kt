package com.example.mobile_10_exercicio_quiz.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun StartScreen(modifier: Modifier = Modifier) {
    Column(
        modifier =
            modifier
                .fillMaxSize()
                .background(Color.Cyan)
    ) {
        Text(text = "QUIZATRON 3000")
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Text(text = "COMECAR!")
        }
    }


}