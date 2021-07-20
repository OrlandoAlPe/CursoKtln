package com.orlandoalpe.dice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView


class MainActivity : AppCompatActivity() {
    lateinit var diceNum:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        //rollButton.text = "Roll!"
        diceNum = findViewById(R.id.dice_image)
        rollButton.setOnClickListener{
             rollDice()
        // Toast.makeText(this, "Button tapped", Toast.LENGTH_SHORT).show()
        }

    }

    private fun rollDice() {
        val randomInt = (1..6).random()
        val imageNum= when(randomInt){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3-> R.drawable.dice_3
            4->R.drawable.dice_4
            5->R.drawable.dice_5
            6->R.drawable.dice_6
            else -> R.drawable.empty_dice
        }
        diceNum.setImageResource(imageNum)
        //diceNum.text = randomInt.toString()

    }
}