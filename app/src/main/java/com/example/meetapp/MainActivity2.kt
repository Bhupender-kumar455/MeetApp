package com.example.meetapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ToggleButton
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
         val men = findViewById<ToggleButton>(R.id.men)
         val women = findViewById<ToggleButton>(R.id.women)
         val other = findViewById<ToggleButton>(R.id.other)

        men.setOnClickListener {
            women.isChecked = false
            other.isChecked = false
        }
        women.setOnClickListener {
            men.isChecked = false
            other.isChecked = false
        }
        other.setOnClickListener {
            women.isChecked = false
            men.isChecked = false
        }
       val leagueButton = findViewById<Button>( R.id.button)
        leagueButton.setOnClickListener {
            val skillIntent = Intent(this,MainActivity3::class.java)
            startActivity(skillIntent)

        }

    }
}