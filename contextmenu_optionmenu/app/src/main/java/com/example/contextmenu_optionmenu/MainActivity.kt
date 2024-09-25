package com.example.contextmenu_optionmenu

import android.annotation.SuppressLint
import android.content.Intent
import android.content.pm.PackageManager
import android.database.Cursor
import android.graphics.Color
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.view.ContextMenu
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.ListView
import android.widget.SearchView
import android.widget.SimpleCursorAdapter
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.google.android.material.floatingactionbutton.FloatingActionButton
import android.widget.AdapterView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var tv1 : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         tv1=findViewById(R.id.textView1)
        registerForContextMenu(tv1)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        return super.onCreateOptionsMenu(menu)

        menu?.add(101,1001,1,"New group")
        menu?.add(102,1002,2,"New broadcast")
        menu?.add(103,1002,3,"Linked devices")
        menu?.add(104,1003,4,"Payment")
        menu?.add(105,1004,5,"Setting")

        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when(item.itemId){
            1001->Toast.makeText(applicationContext,"New group clicked",Toast.LENGTH_LONG).show()
            1002->Toast.makeText(applicationContext,"New broadcast clicked!!",Toast.LENGTH_LONG).show()
            1003->tv1.textSize = 40f
            1005->{
                startActivity(Intent(this,Setingactivity::class.java))
            }

        }
        return super.onOptionsItemSelected(item)
    }

    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {

        menu?.setHeaderTitle("Chose color")
        menu?.add(101,1111,1,"RED")
        menu?.add(102,1112,2,"CYAN")
        menu?.add(103,1113,3,"MAGENTA")
        menu?.add(104,1114,4,"PINK")
        menu?.add(105,1115,5,"YELLOW")

        super.onCreateContextMenu(menu, v, menuInfo)
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {

        when(item.itemId){
            1111->tv1.setTextColor(Color.RED)
            1112->tv1.setTextColor(Color.CYAN)
            1113->tv1.setTextColor(Color.MAGENTA)
            1114->tv1.setTextColor(Color.BLUE)
            1115->tv1.setTextColor(Color.YELLOW)

        }
        return super.onContextItemSelected(item)
    }
}







