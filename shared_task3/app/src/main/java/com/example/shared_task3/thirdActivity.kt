package com.example.shared_task3

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.addTextChangedListener
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class thirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_third)

        var etmail : EditText = findViewById(R.id.etemail)

        etmail.addTextChangedListener {   }

        var btn : Button = findViewById(R.id.button3)

        btn.setOnClickListener {
            var i = Intent (this,fourthActivity::class.java)
            startActivity(i)
        }

    }
}