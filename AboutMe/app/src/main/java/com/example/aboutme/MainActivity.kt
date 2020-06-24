package com.example.aboutme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.aboutme.databinding.ActivityMailBinding

class MailActiivty : AppCompatActivity() {

    private lateinit var binding: ActivityMailBinding
    private val myname: Myname = Myname(name = "Ryan Lee")

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        //data binding
        binding = DataBindingUtil.setContentView(this,R.layout.activity_mail)
        binding.myname = myname
        //setContentView(R.layout.activity_mail)

        binding.enterButton.setOnClickListener {
            Toast.makeText(this,"Button Pressed", Toast.LENGTH_SHORT).show()
        }

    }
}