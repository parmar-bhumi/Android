package com.example.task1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.RatingBar
import android.widget.SeekBar
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class framelayout : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_framelayout)

        var rb : RatingBar = findViewById(R.id.ratingBar)
        var tv : TextView = findViewById(R.id.textView5)

        rb.setOnRatingBarChangeListener { ratingBar, fl, b ->
            tv.setText("Rating is:$fl")
        }


        var sb : SeekBar = findViewById(R.id.seekBar)
        var tv2 : TextView = findViewById(R.id.textView6)

        sb.setOnSeekBarChangeListener(object:SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                tv2.setText("Seek is : $p1")
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {

            }

            override fun onStopTrackingTouch(p0: SeekBar?) {

            }
        })

        var btn : Button = findViewById(R.id.button7)

        btn.setOnClickListener {
            var i = Intent(this,secondActivity::class.java)
            startActivity(i)
        }


    }
}