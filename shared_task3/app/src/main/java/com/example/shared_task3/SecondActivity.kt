package com.example.shared_task3

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)

        var ed_unm: EditText = findViewById(R.id.editTextTextPersonName)
        var ed_pass: EditText = findViewById(R.id.editTextTextPersonName2)
        var btn_login: Button = findViewById(R.id.button)
        var btn_reg: Button =findViewById(R.id.button2)
        var sp = application.getSharedPreferences("loginfile", Context.MODE_PRIVATE)
        var editor = sp.edit()

        btn_login.setOnClickListener {
            editor.putString("unm", ed_unm.text.toString())
            editor.putString("pass", ed_pass.text.toString())
            editor.commit()
            Toast.makeText(applicationContext, "Login Successfully", Toast.LENGTH_SHORT).show()
            ed_unm.setText("")
            ed_pass.setText("")
        }
        btn_reg.setOnClickListener {
            var i= Intent(this,register_form::class.java)
            startActivity(i)
        }

    }
}