package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AutoCompleteTextView
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    private lateinit var BTNYes : Button
    private lateinit var BTNNo : Button
    private lateinit var BTNNext : ImageButton
    private lateinit var  BTNPrev : ImageButton
    private lateinit var TVText: TextView

    private val quizViewModel:QuizViewModel by lazy {
        val provder= ViewModelProvider(this)
        provder.get(QuizViewModel::class.java)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        BTNYes=findViewById(R.id.BTNYes)
        BTNNo=findViewById(R.id.BTNNo)
        BTNNext=findViewById(R.id.BTNNext)
        BTNPrev=findViewById(R.id.BTNPrev)
        TVText=findViewById(R.id.TVText)

        BTNYes.setOnClickListener{
            checkAnswer(true)
        }
        BTNNo.setOnClickListener{
            checkAnswer(false)
        }
        BTNNext.setOnClickListener{
            quizViewModel.moveToNext()
            updateQuestion()
        }
        BTNPrev.setOnClickListener{
            quizViewModel.moveToPrev()
            updateQuestion()
        }
        updateQuestion()
    }
    private fun updateQuestion(){
        val quest
    }
}