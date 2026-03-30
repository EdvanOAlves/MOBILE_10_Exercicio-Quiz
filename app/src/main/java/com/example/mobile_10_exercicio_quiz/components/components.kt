package com.example.mobile_10_exercicio_quiz.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mobile_10_exercicio_quiz.model.Question
import com.example.mobile_10_exercicio_quiz.quiz.QuizScreenViewModel


@Composable
fun MediumText(modifier: Modifier = Modifier, text: String?) {
    Text(
        modifier = modifier.padding(vertical = 12.dp, horizontal = 24.dp),
        text = text.toString(),
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
fun QuestionCard(modifier: Modifier = Modifier, quizScreenViewModel: QuizScreenViewModel) {
    val currentQuestion by quizScreenViewModel.currentQuestion.observeAsState()

    Card(
        modifier = Modifier
            .fillMaxWidth()
    ){
        Column(
            Modifier.padding(12.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalAlignment = Alignment.Start
        ) {

            MediumText(text = currentQuestion?.text)

            var i = 0
            currentQuestion?.options?.forEachIndexed { index, option ->
                QuestionOption(
                    modifier = Modifier,
                    content = option,
                    escolherOpcao = {
                        quizScreenViewModel.onAnswer(index)
                    }
                )
            }
        }
    }

}

