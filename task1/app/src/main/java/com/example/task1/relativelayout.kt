package com.example.task1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast
import android.widget.ToggleButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class relativelayout : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_relativelayout)

        var btn: Button =findViewById(R.id.button)
        btn.setOnClickListener {
            Toast.makeText(applicationContext,"clicked", Toast.LENGTH_LONG).show()
        }

        var imgBtn: ImageButton =findViewById(R.id.imgbtn)
        btn.setOnClickListener {
            Toast.makeText(applicationContext,"image selected", Toast.LENGTH_LONG).show()
        }

        var imgview : ImageView = findViewById(R.id.imgview)

        var tglbtn : ToggleButton = findViewById(R.id.togglebtn)
        tglbtn.setOnClickListener {
            if(tglbtn.text.equals("off")){
                imgview.setImageResource(R.drawable.off)
            }else{
                imgview.setImageResource(R.drawable.on)
            }
        }

        var str : String

        var ch1 : CheckBox = findViewById(R.id.checkBox)
        var ch2 : CheckBox = findViewById(R.id.checkBox2)
        var ch3 : CheckBox = findViewById(R.id.checkBox3)
        var textview : TextView = findViewById(R.id.textView)

        ch1.setOnClickListener {
            str="Mca ${ch1.isChecked} \n Kotlin : ${ch2.isChecked} \n Java : ${ch2.isChecked}"
            textview.setText(str)
        }

        ch2.setOnClickListener {
            str="Mca ${ch1.isChecked} \n Kotlin : ${ch2.isChecked} \n Java : ${ch2.isChecked}"
            textview.setText(str)
        }

        ch3.setOnClickListener {
            str="Mca ${ch1.isChecked} \n Kotlin : ${ch2.isChecked} \n Java : ${ch2.isChecked}"
            textview.setText(str)
        }

        var rg : RadioGroup = findViewById(R.id.radiogroup)
        var tv2 : TextView = findViewById(R.id.textView2)
        var resetbtn : Button = findViewById(R.id.button2)

        rg.setOnCheckedChangeListener() { radioGroup, i ->
            var rb = findViewById<RadioButton>(i)
            if(rb!=null){
                tv2.setText(rb.text)
            }
        }

        resetbtn.setOnClickListener {
            rg.clearCheck()
            tv2.setText("Select options")
        }



        var btnn : Button = findViewById(R.id.button2)

        btnn.setOnClickListener {
            var i = Intent(this,secondActivity::class.java)
            startActivity(i)
        }

    }
}