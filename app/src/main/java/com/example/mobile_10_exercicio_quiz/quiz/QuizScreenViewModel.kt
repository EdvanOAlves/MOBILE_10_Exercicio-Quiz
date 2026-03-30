package com.example.mobile_10_exercicio_quiz.quiz

import android.R.attr.label
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mobile_10_exercicio_quiz.model.Question

//Montando questionário
//TODO: Puxar importação do data.QuizQuestions
private val questionaire = listOf(
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



class QuizScreenViewModel: ViewModel() {
    private val _quizFinishState = MutableLiveData<Boolean>(false)
    var quizFinish = _quizFinishState
    private val _currentIndexState = MutableLiveData<Int>(0)
    var currentIndex: LiveData<Int> = _currentIndexState

    //Criando um objeto estavel mutável
    private val _scoreState = MutableLiveData<Int>(0)

    //Variável para coletar o resultado ao ser alterado
    var score: LiveData<Int> = _scoreState

    private val _currentQuestionState = MutableLiveData<Question>(questionaire[currentIndex.value!!])
    var currentQuestion: LiveData<Question> = _currentQuestionState

    fun onQuestionChange(){
        if (currentIndex.value == questionaire.size){
                _quizFinishState.value = true
        }
        else{
            _currentQuestionState.value = questionaire[_currentIndexState.value!!]
        }
    }

    fun onAnswer(answerIndex:Int){
        var correctAnswer = currentQuestion.value?.correctAnswerIndex

        if(answerIndex == correctAnswer){
            _scoreState.value = _scoreState.value!! + 1;
        }
        _currentIndexState.value = _currentIndexState.value!! + 1
        onQuestionChange()
    }

    fun reset(){
        _currentIndexState.value = 0
        _scoreState.value = 0
        _quizFinishState.value = false
        _currentQuestionState.value = questionaire[_currentIndexState.value!!]
    }
}