package com.example.mobile_10_exercicio_quiz.data

import com.example.mobile_10_exercicio_quiz.model.Question

object QuizQuestions{
    val questionaire = listOf(
        Question("Qual o bioma do Elemental do Caos?",
            listOf("Corrupt", "Crimson", "Hallow", "Jungle"),
            2),
        Question(
            "Qual inimigo dropa o summon de Adaga Encantada?",
            listOf("Rainha Slime", "Espada Encantada", "Mimíco Hallow", "Tá mentindo, a princesa vende"),
            correctAnswerIndex = 0
        ),
        Question(
            "Qual dessas classes não existe mais?",
            listOf("Melee", "Ranged", "Summoner", "Throwing"),
            3
        )
    )
}