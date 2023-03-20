package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var display : TextView
    lateinit var editFirst : EditText
    lateinit var editSecond : EditText
    lateinit var add : Button
    lateinit var sub : Button
    lateinit var multiply : Button
    lateinit var div : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        display = findViewById(R.id.display_result)
        editFirst = findViewById(R.id.edit_first)
        editSecond = findViewById(R.id.edit_second)
        add = findViewById(R.id.add)
        sub = findViewById(R.id.subtract)
        multiply = findViewById(R.id.multiply)
        div = findViewById(R.id.Divide)




        add.setOnClickListener {

            val res1 = editFirst.text.toString().toInt()
            val res2 = editSecond.text.toString().toInt()

            addition(res1, res2)

        }

        sub.setOnClickListener {

            val res1 = editFirst.text.toString().toInt()
            val res2 = editSecond.text.toString().toInt()

                subtraction(res1, res2)
26
        }

        multiply.setOnClickListener {

            val res1 = editFirst.text.toString().toInt()
            val res2 = editSecond.text.toString().toInt()

            multiplication(res1, res2)
        }

        div.setOnClickListener {

            val res1 = editFirst.text.toString().toInt()
            val res2 = editSecond.text.toString().toInt()

            divison(res1, res2)

        }

    }

    private fun addition(res1: Int, res2: Int)
    {
        val result = res1 + res2
        display.text = result.toString()
    }
    private fun subtraction(res1: Int, res2: Int)
    {
        val result = res1 -  res2
        display.text = result.toString()
    }
    private fun multiplication(res1: Int, res2: Int)
    {
        val result = res1 * res2
        display.text = result.toString()
    }

    private fun divison(res1: Int, res2: Int)
    {
        val result = res1 / res2
        display.text = result.toString()
    }
}