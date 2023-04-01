package com.example.meetapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import android.widget.ToggleButton
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        var selectedLeague = ""
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
         val men = findViewById<ToggleButton>(R.id.men)
         val women = findViewById<ToggleButton>(R.id.women)
         val other = findViewById<ToggleButton>(R.id.other)

        men.setOnClickListener {
            women.isChecked = false
            other.isChecked = false
            selectedLeague ="men"
        }
        women.setOnClickListener {
            men.isChecked = false
            other.isChecked = false
            selectedLeague="women"
        }
        other.setOnClickListener {
            women.isChecked = false
            men.isChecked = false
            selectedLeague="other"
        }
       val leagueButton = findViewById<Button>( R.id.button)
        leagueButton.setOnClickListener {
            if(selectedLeague!=""){
                val skillIntent = Intent(this,MainActivity3::class.java)
                skillIntent.putExtra(EXTRA_LEAGUE,selectedLeague)
                startActivity(skillIntent)
            }
          else{
              Toast.makeText(this,"Aeee! kuch select to kr! ",Toast.LENGTH_LONG).show()
            }

        }

    }
}