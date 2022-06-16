package dev.chepkoech.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    lateinit var tilFirstNumber: TextInputLayout
    lateinit var tilSecondNumber: TextInputLayout
    lateinit var etFirstNumber: EditText
    lateinit var etSecondNumber: EditText
    lateinit var btnAdd: Button
    lateinit var btnSubtract: Button
    lateinit var btnDivision: Button
    lateinit var btnModulus: Button
    lateinit var tvResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tilFirstNumber = findViewById(R.id.tilFirstNumber)
        tilSecondNumber = findViewById(R.id.tilSecondNumber)
        etFirstNumber = findViewById(R.id.etFirstNumber)
        etSecondNumber = findViewById(R.id.etSecondNumber)
        btnAdd = findViewById(R.id.btnAdd)
        btnSubtract = findViewById(R.id.btnSubtract)
        btnDivision = findViewById(R.id.btnDivision)
        btnModulus = findViewById(R.id.btnModulus)
        tvResult = findViewById(R.id.tvResult)

        btnAdd.setOnClickListener{
            val firstNumber = etFirstNumber.text.toString()
            val secondNumber = etSecondNumber.text.toString()
            add(firstNumber.toInt(),secondNumber.toInt())
            validate()
        }
        btnSubtract.setOnClickListener{
            val firstNumber = etFirstNumber.text.toString()
            val secondNumber = etSecondNumber.text.toString()
            subtract(firstNumber.toInt(),secondNumber.toInt())
            validate()
        }
        btnDivision.setOnClickListener{
            val firstNumber = etFirstNumber.text.toString()
            val secondNumber = etSecondNumber.text.toString()
            divide(firstNumber.toInt(),secondNumber.toInt())
            validate()
        }
        btnModulus.setOnClickListener{
            val firstNumber = etFirstNumber.text.toString()
            val secondNumber = etSecondNumber.text.toString()
            modulus(firstNumber.toInt(), secondNumber.toInt())
            validate()
        }
    }
    fun validate(){
        val firstNumber = etFirstNumber.text.toString()
        val secondNumber = etSecondNumber.text.toString()

        if (firstNumber.isBlank())
            tilFirstNumber.error = "Please input first number"
        if(secondNumber.isBlank())
            tilSecondNumber.error = "Please input second number"
    }
    fun add(firstNumber: Int, secondNumber: Int){
        val add = firstNumber + secondNumber
        tvResult.text = add.toString()
        validate()
    }

    fun subtract(firstNumber: Int, secondNumber: Int){
        val subtract = firstNumber - secondNumber
        tvResult.text = subtract.toString()
    }
    fun divide(firstNumber: Int, secondNumber: Int){
        val divide = firstNumber / secondNumber
        tvResult.text = divide.toString()
    }
    fun modulus(firstNumber: Int, secondNumber: Int){
        val modulus = firstNumber % secondNumber
        tvResult.text = modulus.toString()
    }

}