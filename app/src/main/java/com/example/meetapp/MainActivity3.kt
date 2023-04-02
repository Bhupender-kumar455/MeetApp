package com.example.meetapp
import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import android.widget.ToggleButton
import androidx.appcompat.app.AppCompatActivity

class MainActivity3 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        var league=""
        league= intent.getStringExtra(EXTRA_LEAGUE).toString()
        var skill =""
        val firstButton = findViewById<ToggleButton>(R.id.beginnerbutton)
        val secondButton = findViewById<ToggleButton>(R.id.probutton)
        val finishButton = findViewById<Button>(R.id.finishbutton)
        println(league)
        firstButton.setOnClickListener{
            secondButton.isChecked=false
            skill ="Beginner"
        }
        secondButton.setOnClickListener {
            firstButton.isChecked=false
            skill="pro!"
        }
        finishButton.setOnClickListener {
            if(skill!=""){
                val finishActivity = Intent(this,MainActivity4::class.java)
                finishActivity.putExtra(EXTRA_LEAGUE,league)
                finishActivity.putExtra(EXTRA_SKILL,skill)
                startActivity(finishActivity)
            }
            else{
                Toast.makeText(this,"Are Yr!. kuch Select to kr ",Toast.LENGTH_LONG).show()
            }

        }
    }
}