package com.example.diceroller

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    //best practices putting initializes in the top using lateinit
    lateinit var diceimage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // ^^ UNTOUCHED

        //id the different parts of the UIs
        val rollbutton: Button = findViewById(R.id.roll_button)

        //what happens when it gets clicked
        rollbutton.setOnClickListener {
            Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()
            rolldice()
        }
    }

    private fun rolldice() {
        val resultText: TextView = findViewById(R.id.resultview)
        val randomint = Random.nextInt(6) + 1

        resultText.text = randomint.toString()

        //pt2
        //val diceimage: ImageView = findViewById(R.id.dice_image) -- moved up using lateinit
        //KOTLIN WHEN STATEMENT
        val drawable_resource =
            when (randomint) {
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                else -> R.drawable.dice_6
        }

        diceimage.setImageResource(drawable_resource)
    }
}
