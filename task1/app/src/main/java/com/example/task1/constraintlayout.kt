package com.example.task1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class constraintlayout : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_constraintlayout)

        var btn : Button = findViewById(R.id.button)

        btn.setOnClickListener {
            var i = Intent(this,secondActivity::class.java)
            startActivity(i)
        }

    }
}