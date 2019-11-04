package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var ivPlus: ImageView
    private lateinit var ivMinus: ImageView

    private lateinit var etNumber1: EditText
    private lateinit var etNumber2: EditText
    private lateinit var tvResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ivPlus = findViewById(R.id.iv_plus)
        ivMinus = findViewById(R.id.iv_minus)

        etNumber1 = findViewById(R.id.et_number1)
        etNumber2 = findViewById(R.id.et_number2)
        tvResult = findViewById(R.id.tv_result)

        ivPlus.setOnClickListener {
            val number1 = etNumber1.text.toString().toBigDecimal()
            val number2 = etNumber2.text.toString().toBigDecimal()
            val sum = number1 + number2
            tvResult.text = sum.toString()
        }

        ivMinus.setOnClickListener {
            val number1 = etNumber1.text.toString().toBigDecimal()
            val number2 = etNumber2.text.toString().toBigDecimal()
            val sum = number1 - number2
            tvResult.text = sum.toString()
        }
    }
}