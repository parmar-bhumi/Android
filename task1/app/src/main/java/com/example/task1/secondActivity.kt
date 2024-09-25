package com.example.task1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintSet
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class secondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)

        var btn : Button = findViewById(R.id.button2)
        var btn2 : Button = findViewById(R.id.button3)
        var btn3 : Button = findViewById(R.id.button4)
        var btn4 : Button = findViewById(R.id.button5)

        btn.setOnClickListener {
            var i = Intent(this, constraintlayout::class.java)
            startActivity(i)
        }

        btn2.setOnClickListener {
            var i = Intent(this,linearlayout::class.java)
            startActivity(i)
        }

        btn3.setOnClickListener {
            var i = Intent(this,relativelayout::class.java)
            startActivity(i)
        }

        btn4.setOnClickListener {
            var i = Intent(this,framelayout::class.java)
            startActivity(i)
        }

        var btne : Button = findViewById(R.id.button9)

        btne.setOnClickListener {
            var i = Intent(this,MainActivity::class.java)
            startActivity(i)
        }

    }
}