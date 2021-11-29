package com.example.studyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var kotlinBtn: Button
    lateinit var androidBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        kotlinBtn = findViewById(R.id.kotlinBtn)
        androidBtn = findViewById(R.id.androidBtn)

        kotlinBtn.setOnClickListener {
            startActivity(Intent(this,KotlinCourseActivity::class.java))
        }
        androidBtn.setOnClickListener {
            startActivity(Intent(this,AndroidCourseActivity::class.java))
        }

    }
}