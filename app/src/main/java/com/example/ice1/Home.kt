package com.example.ice1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Home : AppCompatActivity() {
    private lateinit var englishButton: Button
    private lateinit var germanButton: Button
    private lateinit var italianButton: Button
    private lateinit var hindiButton: Button
    private lateinit var tamilButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        englishButton = findViewById(R.id.button)
        germanButton = findViewById(R.id.button2)
        italianButton = findViewById(R.id.button3)
        hindiButton = findViewById(R.id.button4)
        tamilButton = findViewById(R.id.button5)

        text = findViewById(R.id.textView)


        englishButton.setClickListener{

            var intent1 = Intent(this,Home::class.java)
            startActivity(intent1)


        }


    }

    }