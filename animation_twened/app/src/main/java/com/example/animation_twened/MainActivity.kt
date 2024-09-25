package com.example.animation_twened

import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        var iv : ImageView = findViewById(R.id.imageView)

        var b1 : Button = findViewById(R.id.btn1)
        b1.setOnClickListener {
            var an = AnimationUtils.loadAnimation(this,R.anim.spin)
            iv.startAnimation(an)
        }

        var b2 : Button = findViewById(R.id.btn2)
        b2.setOnClickListener {
            var an = AnimationUtils.loadAnimation(this,R.anim.move)
            iv.startAnimation(an)
        }

        var b3 : Button = findViewById(R.id.btn3)
        b3.setOnClickListener {
            var an = AnimationUtils.loadAnimation(this,R.anim.blink)
            iv.startAnimation(an)
        }
        var b4 : Button = findViewById(R.id.btn4)
        b4.setOnClickListener {
            var an = AnimationUtils.loadAnimation(this,R.anim.zoom)
            iv.startAnimation(an)
        }
    }
}