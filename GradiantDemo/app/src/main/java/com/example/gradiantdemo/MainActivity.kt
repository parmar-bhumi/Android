package com.example.gradiantdemo

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.LinearGradient
import android.graphics.Paint
import android.graphics.RadialGradient
import android.graphics.Shader
import android.graphics.SweepGradient
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        //setContentView(R.layout.activity_main)
        setContentView(Test(applicationContext))
    }

    inner class Test(context: Context) : View(context){
        var p = Paint(Paint.ANTI_ALIAS_FLAG)
        override fun onDraw(canvas: Canvas) {
            super.onDraw(canvas)

            var lg = LinearGradient(0f,0f,45f,45f,Color.RED,Color.BLACK,Shader.TileMode.MIRROR)
            p.shader = lg
            canvas?.drawCircle(250f,250f,200f,p)

            var rg = RadialGradient(200f,600f,200f,Color.RED,Color.YELLOW,Shader.TileMode.MIRROR)
            p.shader = rg
            canvas?.drawCircle(250f,750f,200f,p)

            var sg = SweepGradient(200f,1200f, intArrayOf(Color.CYAN,Color.RED,Color.MAGENTA),null)
            p.shader = sg
            canvas?.drawCircle(250f,1200f,200f,p)


        }
    }
}