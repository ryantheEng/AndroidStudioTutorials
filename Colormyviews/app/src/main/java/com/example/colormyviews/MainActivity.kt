package com.example.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.graphics.toColor
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()

    }

    private fun setListeners() {
        val clickable: List<View> =
            listOf(boxone, box2, box3, box4, box5,constraintlayout,yellow_button,greenbutton,bluebutton)

        for (item in clickable) {
            item.setOnClickListener{makeColored(it)}
        }
    }

    private fun makeColored(view: View) {
        when (view.id) {  //color in android.R.color
            R.id.boxone -> view.setBackgroundColor(Color.MAGENTA)
            R.id.box2 -> view.setBackgroundColor(Color.RED)
            R.id.box3 -> view.setBackgroundColor(Color.GREEN)
            R.id.box4 -> view.setBackgroundColor(Color.CYAN)
            R.id.box5 -> view.setBackgroundColor(Color.WHITE)
            R.id.bluebutton -> box2.setBackgroundColor(Color.BLUE)
            R.id.yellow_button -> box3.setBackgroundColor(Color.YELLOW)
            R.id.greenbutton -> box4.setBackgroundColor(Color.GREEN)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}