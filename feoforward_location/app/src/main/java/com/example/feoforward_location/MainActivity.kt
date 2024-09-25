package com.example.feoforward_location

import android.Manifest
import android.content.pm.PackageManager
import android.location.Geocoder
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.Locale

class MainActivity : AppCompatActivity() {

     lateinit var ed : EditText
     lateinit var btn : Button
     lateinit var tv : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ed = findViewById(R.id.editText)
        btn = findViewById(R.id.button)
        tv = findViewById(R.id.textview)

        if (ActivityCompat.checkSelfPermission(this,Manifest.permission.ACCESS_FINE_LOCATION)!=PackageManager.PERMISSION_GRANTED)
        {
            ActivityCompat.requestPermissions(this, arrayOf(
                Manifest.permission.ACCESS_FINE_LOCATION,Manifest.permission.ACCESS_COARSE_LOCATION),111)
        }else{
            btn.setOnClickListener {
                var city = ed.text.toString()
                forwardGeolocation(city)
            }
        }

    }

    private fun forwardGeolocation(city: String) {
        var gc=Geocoder(this, Locale.getDefault())
        var addresses = gc.getFromLocationName(city,2)
        var address = addresses?.get(0)

        if (address != null) {
            tv.setText("${address.longitude}\n ${address.latitude}\n ${address.locality}")
        }

    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode==111 && grantResults[0]==PackageManager.PERMISSION_GRANTED)
            forwardGeolocation(city = "city")
    }
}