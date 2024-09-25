package com.example.task2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class activity_baroda : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_baroda)

        var btn: Button = findViewById(R.id.button2)
        btn.setOnClickListener {
            var i = Intent(this, MainActivity::class.java)
            startActivity(i)
        }

    }
}

