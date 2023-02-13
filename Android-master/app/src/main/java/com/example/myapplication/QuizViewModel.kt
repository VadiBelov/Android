package com.example.myapplication

import androidx.lifecycle.ViewModel

class QuizViewModel:ViewModel() {
    private val questionBank= listOf(
        Quiz(R.string.question_1,answer=true),
        Quiz(R.string.question_2,answer=false),
        Quiz(R.string.question_3,answer=false),
        Quiz(R.string.question_4,answer=true),
        Quiz(R.string.question_5,answer=false),
        Quiz(R.string.question_6,answer=false))
    private val currentIndex=0
    val currentQuestionAnswer:Boolean
        get()=questionBank[currentIndex].answer
    val currentQuestionText:Int
        get()=questionBank[currentIndex].textResId

    fun moveToNext() {
        currentIndex=(currentIndex+1)% questionBank.size
    }
    fun moveToPrev(){
        currentIndex=(questionBank.size+currentIndex-1)%questionBank.size
    }

}