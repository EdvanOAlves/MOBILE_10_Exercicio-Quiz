package com.example.mobile_10_exercicio_quiz.model

//Data class: um objeto parecido com json, guardar dados em objetos sem metodos
data class Question(
    val text: String,
    val options: List<String>,
    val correctAnswerIndex:Int
)