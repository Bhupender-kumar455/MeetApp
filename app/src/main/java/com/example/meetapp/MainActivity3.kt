package com.example.meetapp
import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ToggleButton
import androidx.appcompat.app.AppCompatActivity

class MainActivity3 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val firstButton = findViewById<ToggleButton>(R.id.beginnerbutton)
        val secondButton = findViewById<ToggleButton>(R.id.probutton)

        firstButton.setOnClickListener{
            secondButton.isChecked=false
        }
        secondButton.setOnClickListener {
            firstButton.isChecked=false
        }
    }
}