package com.example.task1

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.Calendar


class linearlayout : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_linearlayout)

        var actv : AutoCompleteTextView = findViewById(R.id.autoCompleteTextView)
        var city = arrayOf("bhavnagar","Vapi","baroda","surat","Rajkot")
        var adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_checked,city)
        actv.setAdapter(adapter)

        var mactv : AutoCompleteTextView = findViewById(R.id.multiAutoCompleteTextView)
        var skill = arrayOf("web design","android developer","flutter","react","dev ops")
        var skilladapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_checked,skill)
        mactv.setAdapter(skilladapter)
        //mactv.setTokenizer(MultiAutoCompleteTextView.CommaTokenizer())

        var etEmail : EditText = findViewById(R.id.editTextEmail)
        etEmail.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                if(!android.util.Patterns.EMAIL_ADDRESS.matcher(p0).matches()){
                    etEmail.setError("Invalid input")
                }
            }

            override fun afterTextChanged(p0: Editable?) {
            }
        })

        var etDate : EditText = findViewById(R.id.editTextDate)
        var c = Calendar.getInstance()

        etDate.setOnClickListener {
            DatePickerDialog(this,DatePickerDialog.OnDateSetListener { datePicker, year, month, day ->
                etDate.setText("$day/${month}/$year")
                //Toast.makeText(applicationContext,"$year/${month+1}/$day",Toast.LENGTH_LONG).show()
            }, c.get(Calendar.YEAR),c.get(Calendar.MONTH),c.get(Calendar.DAY_OF_MONTH)).show()
        }

        var etTime : EditText = findViewById(R.id.etime)
        etTime.setOnClickListener{
            TimePickerDialog(this,TimePickerDialog.OnTimeSetListener { timePicker, hours, minutes ->
                etTime.setText("$hours/${minutes}")
            }, c.get(Calendar.HOUR),c.get(Calendar.MINUTE),true).show()
        }

        var btn : Button = findViewById(R.id.button6)

        btn.setOnClickListener {
            var i = Intent(this,secondActivity::class.java)
            startActivity(i)
        }



    }
}