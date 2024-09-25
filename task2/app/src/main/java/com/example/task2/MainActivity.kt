package com.example.task2

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        var lstview : ListView = findViewById(R.id.listview)
        var city = arrayOf("Rajkot","Surat","Baroda","Goa")
        var adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,city)
        lstview.adapter = adapter

        lstview.setOnItemClickListener { adapterView, view, i, l ->
            var value = lstview.getItemAtPosition(i).toString()
            Toast.makeText(applicationContext,value,Toast.LENGTH_LONG).show()

            if(i==0)
            {
                var intent = Intent(this,activity_rajkot::class.java)
                startActivity(intent)
            }

            if(i==1)
            {
                var intent = Intent(this,activity_surat::class.java)
                startActivity(intent)
            }

            if(i==2)
            {
                var intent = Intent(this,activity_baroda::class.java)
                startActivity(intent)
            }

            if(i==3)
            {
                var intent = Intent(this,Actibity_goa::class.java)
                startActivity(intent)
            }
        }

    }
}