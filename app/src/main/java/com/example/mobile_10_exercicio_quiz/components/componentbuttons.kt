package com.example.mobile_10_exercicio_quiz.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ButtonYellow(modifier: Modifier = Modifier, text:String, onClick: ()->Unit) {
    OutlinedButton(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(
            containerColor = Color(227, 201, 65, 255),
        )
    ) {
        Text(
            modifier = Modifier.padding(vertical = 12.dp, horizontal = 24.dp),
            text = text,
            fontSize = 20.sp,
            textAlign = TextAlign.Start,
            color = Color.Black
        )
    }
}

@Composable
fun QuestionOption(
    modifier: Modifier = Modifier,
    content:String,
    escolherOpcao:  () -> Unit
) {
    OutlinedButton(
        onClick = {
            escolherOpcao()
        },
        modifier = Modifier
            .fillMaxWidth(),
        shape = RoundedCornerShape(8.dp)
    ) {
        MediumText(
            Modifier.fillMaxWidth(),
            text = content,
        )
    }
}