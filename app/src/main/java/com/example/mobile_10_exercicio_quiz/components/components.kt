package com.example.mobile_10_exercicio_quiz.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.PointerEventPass
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun MediumText(modifier: Modifier = Modifier, text:String) {
    Text(
        modifier = modifier.padding(vertical = 12.dp, horizontal = 24.dp),
        text = text,
        fontSize = 24.sp,
        textAlign = TextAlign.Start
    )
}
@Composable
fun GreenDisplay(modifier: Modifier = Modifier, text:String) {
    Row(
        Modifier
            .background(
                Color(86, 197, 136, 255),
                shape = RoundedCornerShape(20.dp)

            )
            .border(
                1.dp,
                Color.Black,
                shape = RoundedCornerShape(20.dp)
            ),
        horizontalArrangement = Arrangement.Start
    ) {
        MediumText(text = text)
    }

}

@Composable
fun QuestionCard(modifier: Modifier = Modifier) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
    ){
        Column(
            Modifier.padding(12.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalAlignment = Alignment.Start
        ) {
            MediumText(text = "Qual é a capital da França?")
            QuestionOption(Modifier,"Londres")
            QuestionOption(Modifier,"Berlim")
            QuestionOption(Modifier,"Paris")
            QuestionOption(Modifier,"Madri")
        }
    }

}

