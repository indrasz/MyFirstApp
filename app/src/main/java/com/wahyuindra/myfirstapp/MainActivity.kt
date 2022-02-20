package com.wahyuindra.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClick : Button = findViewById(R.id.btnClick)

        btnClick.setOnClickListener(){
            rollDices()
        }
    }

    private fun rollDices() {
        val randomNumber = Random().nextInt(6) + 1
        val ivDice : ImageView = findViewById(R.id.ivDice)

        val imageResource =
            when (randomNumber){
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                else -> R.drawable.dice_6
            }

        ivDice.setImageResource(imageResource)
    }
}