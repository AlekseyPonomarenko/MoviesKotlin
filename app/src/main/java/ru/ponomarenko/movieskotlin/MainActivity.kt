package ru.ponomarenko.movieskotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.text)

        //a. Сформировать data class с двумя свойствами и вывести их на экран приложения.
        val buttonA = findViewById<Button>(R.id.buttonA)
        buttonA.setOnClickListener {

            val params = Params("Привет", "Мир")
            textView.text = "$params"
        }

        //b. Создать Object. В Object вызвать copy и вывести значения скопированного класса на
        //экран.
        val buttonB = findViewById<Button>(R.id.buttonB)
        buttonB.setOnClickListener {
            //TaskB.copy() - не работает
            //Log.d("myApp",TaskB.copy())
        }

        //c. Вывести значения из разных циклов в консоль, используя примеры из методических
        //материалов
        val buttonC = findViewById<Button>(R.id.buttonC)
        buttonC.setOnClickListener {

            val weatherList = mutableListOf("Погода1", "Погода2", "Погода3")
            for(weather in weatherList) {
                println(weather)
            }

            for(i in 1..10) {
                println("$i. Hello Kotlin!")
            }
        }

    }
}

/**
 * Сформировать data class с двумя свойствами и вывести их на экран приложения.
 */
data class Params(val param1: String = "param1", val param2: String = "param 2")

object TaskB {

}