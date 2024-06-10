package com.example.sayjelpracticum

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

        class MainActivity : AppCompatActivity() {

            private lateinit var btnContinue: Button
            private lateinit var btnExit: Button

            @SuppressLint("MissingInflatedId")
            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_main)

                ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.cl_main)) { v, insets ->
                    val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
                    v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
                    insets
                }

                btnContinue = findViewById(R.id.btnContinue)
                btnExit = findViewById(R.id.btnExit)

                btnContinue.setOnClickListener {
                    val intent = Intent(this, HomeActivity::class.java)
                    startActivity(intent)
                }

                btnExit.setOnClickListener {
                    finish()

        }


    }
    }
