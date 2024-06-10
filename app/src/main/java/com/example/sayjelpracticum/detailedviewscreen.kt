package com.example.sayjelpracticum

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
        class SummaryActivity : AppCompatActivity() {

            private lateinit var tvSum : TextView

            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_detailedviewscreen)

                tvSum = findViewById(R.id.tvSum)

                val days = intent.getStringArrayListExtra("days")
                val minTemps = intent.getFloatArrayExtra("min_temps")
                val maxTemps = intent.getFloatArrayExtra("max_temps")
                val conditions = intent.getStringArrayListExtra("conditions")

                if (days != null && minTemps != null && maxTemps != null && conditions != null) {
                    val summaryBuilder = StringBuilder()
                    for (i in days.indices) {
                        summaryBuilder.append("Day: ${days[i]}, Min Temp: ${minTemps[i]}, Max Temp: ${maxTemps[i]}, Conditions: ${conditions[i]}\n")
                    }
                    tvSum.text = summaryBuilder.toString()
                } else {
                    tvSum.text = "No data available"
        }


    }
    }
