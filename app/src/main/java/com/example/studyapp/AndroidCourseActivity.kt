package com.example.studyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class AndroidCourseActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_android_course)

        title = "Android"

        val courses = listOf(
            Course("Project Setup", "Setting up an Android Studio Project.", "Detailed notes here."),
            Course("Console", "Printing to the console.", "Detailed notes here."),
            Course("Resource Files", "Identifying, editing, and using resource files.", "Detailed notes here."),
            Course("UI Elements", "Creating, modifying, and initializing UI Elements.", "Detailed notes here.")
        )

        val rvAndroid = findViewById<RecyclerView>(R.id.rvAndroid)
        rvAndroid.adapter = ViewAdapter(courses,this)
        rvAndroid.layoutManager = LinearLayoutManager(this)
    }
}