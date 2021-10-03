package com.kes.school

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity

class Calculator : AppCompatActivity() {

   // private var button: Button? = null
    private lateinit var  editTextValueOfA: EditText
    private lateinit var  editTextValueOfB: EditText
    private lateinit var  editTextResult: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)
        editTextValueOfA = findViewById(R.id.editTextValueOfA)
        editTextValueOfB = findViewById(R.id.editTextValueOfB)
        editTextResult = findViewById(R.id.editTextResult)
        val buttonClear: Button = findViewById(R.id.buttonClearAll)
        val buttonPlus: Button = findViewById(R.id.buttonPlus)
        val buttonMinus: Button = findViewById(R.id.buttonMinus)
        val buttonMultiplication: Button = findViewById(R.id.buttonMultiplication)
        val buttonDivision: Button = findViewById(R.id.buttonDivision)
        val buttonEquate: Button = findViewById(R.id.buttonEquate)
        var result: Int = 0
        buttonPlus.setOnClickListener{
            result = plus()
        }

        buttonMinus.setOnClickListener {
            result = minus()
        }

        buttonMultiplication.setOnClickListener {
            result = multiplication()
        }

        buttonEquate.setOnClickListener {
            equate(result)
        }

        buttonClear.setOnClickListener {
            editTextValueOfA.setText("")
            editTextValueOfB.setText("")
            editTextResult.setText("")
        }
    }

    fun plus(): Int{
        val valueOfA: Int = editTextValueOfA.text.toString().toInt()
        val valueOfB: Int = editTextValueOfB.text.toString().toInt()
        return valueOfA + valueOfB
    }

    fun minus(): Int{
        val valueOfA: Int = editTextValueOfA.text.toString().toInt()
        val valueOfB: Int = editTextValueOfB.text.toString().toInt()
        return valueOfA - valueOfB
    }

    fun multiplication(): Int{
        val valueOfA: Int = editTextValueOfA.text.toString().toInt()
        val valueOfB: Int = editTextValueOfB.text.toString().toInt()
        return valueOfA * valueOfB
    }

   /* fun division(): Int {
        val valueOfA: Int = editTextValueOfA.text.toString().toInt()
        val valueOfB: Int = editTextValueOfB.text.toString().toInt()
        return if(valueOfB == 0){
            val error = Toast.makeText(this, "Дэбил чи шо?", Toast.LENGTH_SHORT)
        }else{
            (valueOfA.toDouble() / valueOfB.toDouble()).toInt()
        }
    }*/
    fun equate(result: Int){
        editTextResult.setText(result.toString())
    }
}