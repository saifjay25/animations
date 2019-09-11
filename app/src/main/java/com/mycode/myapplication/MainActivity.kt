package com.mycode.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*
import android.util.DisplayMetrics

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val displayMetrics = DisplayMetrics()
        windowManager.defaultDisplay.getMetrics(displayMetrics)
        val height = displayMetrics.heightPixels
        content.layoutParams.width = height+200
        content.layoutParams.height = height+200
        blackCircle.layoutParams.height = height/3
        blackCircle.layoutParams.width = height/3
        val animation = AnimationUtils.loadAnimation(applicationContext, R.anim.shrink)
        val animation2 = AnimationUtils.loadAnimation(applicationContext,R.anim.grow)
        val animation3 = AnimationUtils.loadAnimation(applicationContext,R.anim.growring)
        val animation4 = AnimationUtils.loadAnimation(applicationContext,R.anim.growring2)
        val animation5 = AnimationUtils.loadAnimation(applicationContext,R.anim.growring3)
        blackring.startAnimation(animation3)
        blackring2.startAnimation(animation4)
        blackring3.startAnimation(animation5)
        blackCircle.startAnimation(animation2)
        content.startAnimation(animation)

    }
}
