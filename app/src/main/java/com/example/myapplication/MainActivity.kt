package com.example.myapplication



import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class MainActivity : AppCompatActivity()
{


    @SuppressLint("MissingInflatedId", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.button)
        val result = findViewById<EditText>(R.id.result)
        val nameAText = findViewById<EditText>(R.id.nameOne)
        val nameBText = findViewById<EditText>(R.id.nameTwo)



        button.setOnClickListener{
            val score = (nameAText.length() + nameBText.length()) * 10.0
            if (score<100)
           {
               result.setText("Compatibility:$score%")
           }

            else
           {
               result.setText("Compatibility: 0%")
           }
        }
    }
}