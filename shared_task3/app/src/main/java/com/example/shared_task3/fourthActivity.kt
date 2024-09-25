package com.example.shared_task3

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class fourthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_fourth)

        var tv : TextView = findViewById(R.id.textView4)
        var tv2 : TextView = findViewById(R.id.textView5)
        var tv3 : TextView = findViewById(R.id.textView6)
        var tv4 : TextView = findViewById(R.id.textView7)
        var tv5 : TextView = findViewById(R.id.textView8)
        var tv6 : TextView = findViewById(R.id.textView9)


    }
}