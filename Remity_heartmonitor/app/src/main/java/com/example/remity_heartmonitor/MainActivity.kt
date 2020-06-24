package com.example.remity_heartmonitor
    /* if found something wrong -> activates notification
       --> something wrong random number generator 1 or 0
       --> takes another random number generator to find 
     */

/*
TODO
 -> make heartrate run as a loop??
 -> LEARN THREADING
 */

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity(){

    lateinit var buttonAlarm: Button
    lateinit var buttonMap: Button
    lateinit var heartrate: TextView

    val FIVESECONDS: Long = 5000

    override fun onCreate(savedInstanceState: Bundle?) {
          super.onCreate(savedInstanceState)
          setContentView(R.layout.activity_main)
          buttonlisteners()
          heartrate()
    }

    private fun buttonlisteners() {
        buttonAlarm = findViewById(R.id.button_alarm)
        buttonMap = findViewById(R.id.button_map)

        buttonAlarm.setOnClickListener{
            Toast.makeText(this,"Alarm", Toast.LENGTH_SHORT).show()
            val intentAlarm = Intent(this,AlarmActivity::class.java)
            startActivity(intentAlarm)
        }
        buttonMap.setOnClickListener{
            Toast.makeText(this,"Map",Toast.LENGTH_SHORT).show()
            val intentMap = Intent(this,MapsActivity::class.java)
            startActivity(intentMap)
        }
    }

    private fun heartrate() {
        heartrate = findViewById(R.id.text_heart)
            var text = Random.nextInt(60, 100).toString()
            heartrate.text = text
    }
}
