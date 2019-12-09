package com.example.exercise2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val calculate: Button = findViewById(R.id.buttonCalculate)
        calculate.setOnClickListener { Calculate() }
    }
    private fun Calculate() {
        Toast.makeText(this, "button clicked",
            Toast.LENGTH_SHORT).show()

        val resultText1: EditText = findViewById(R.id.editTextWeight)
        val st1 = resultText1.getText().toString().toDouble()
        val resultText2: EditText = findViewById(R.id.editTextHeight)
        val st2 = resultText2.getText().toString().toDouble()
        val BMI = st1 / (st2*st2)
        val Image: ImageView = findViewById(R.id.imageViewProfile)
            if(BMI<18.5){
            R.drawable.under
                Image.setImageResource(under)
        }else if(BMI>=18.5&&BMI<=24.9){
            R.drawable.normal
                Image.setImageResource(normal)
        }else{
            R.drawable.over
                Image.setImageResource(over)
        }
    }


}
