package com.example.mobile_10_exercicio_quiz.quiz

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mobile_10_exercicio_quiz.model.Question

//Montando questionário
//TODO: Puxar importação do data.QuizQuestions
private val questionaire = listOf(
    Question("Qual o bioma do Elemental do Caos?",
        listOf("Corrupt", "Crimson", "Hallow", "Jungle"),
        3),
    Question(
        "Qual inimigo dropa o summon de Adaga Encantada?",
        listOf("Rainha Slime", "Espada Encantada", "Mimíco Hallow", "Tá mentindo, a princesa vende"),
        correctAnswerIndex = 1
    ),
    Question(
        "Qual dessas classes não existe mais?",
        listOf("Melee", "Ranged", "Summoner", "Throwing"),
        4
    )
)



class QuizScreenViewModel: ViewModel() {
    private val _currentIndexState = MutableLiveData<Int>()
    var currentIndex: LiveData<Int> = _currentIndexState

    //Criando um objeto estavel mutável
    private val _scoreState = MutableLiveData<Int>(0)

    //Variável para coletar o resultado ao ser alterado
    var score: LiveData<Int> = _scoreState

    private val _currentQuestionState = MutableLiveData<Question>(questionaire[0])
    var currentQuestion: LiveData<Question> = _currentQuestionState

    fun onQuestionChange(){
        _currentQuestionState.value = questionaire[currentIndex.value!!]
    }

    fun onAnswer(answerIndex:Int){
        if(answerIndex == currentQuestion.value?.correctAnswerIndex){
            _scoreState.value = _scoreState.value!! + 1;
        }
        _currentIndexState.value = _currentIndexState.value!! + 1

        onQuestionChange()
    }
}