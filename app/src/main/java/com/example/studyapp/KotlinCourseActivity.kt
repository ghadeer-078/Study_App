package com.example.studyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class KotlinCourseActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin_course)

        title = "Kotlin Course"

        val courses = listOf(
            Course("var and val", "Declaring variables.", "Detailed notes here."),
            Course("User Input", "Getting user input.", "Detailed notes here."),
            Course("Strings", "String concatenations, interpolation, and methods.", "Detailed notes here."),
            Course("Data Types", "Understanding data types.", "Detailed notes here."),
            Course("Basic Operations", "Performing math operations in Kotlin.", "Detailed notes here."),
            Course("If Statements", "Understanding when and how to use if, else if, and else statements.", "Detailed notes here."),
            Course("Error Handling", "Using try blocks to avoid runtime errors.", "Detailed notes here."),
            Course("For Loops", "Using for loops to automate code.", "Detailed notes here."),
            Course("While Loops", "Using while loops to automate code.", "Detailed notes here.")
        )

        val rvKotlin = findViewById<RecyclerView>(R.id.rvKotlin)
        rvKotlin.adapter = ViewAdapter(courses,this)
        rvKotlin.layoutManager = LinearLayoutManager(this)
    }
}