package com.example.sayjelpracticum

        import android.content.Intent
                import android.os.Bundle
                import android.widget.Button
                import android.widget.EditText
                import android.widget.TextView
                import androidx.appcompat.app.AppCompatActivity

        class HomeActivity : AppCompatActivity() {

            private lateinit var btnNext: Button
            private val dayList = mutableListOf<String>()
            private val minTempList = mutableListOf<Float>()
            private val maxTempList = mutableListOf<Float>()
            private val weatherList = mutableListOf<String>()

            private lateinit var etDay: EditText
            private lateinit var etMinTemp: EditText
            private lateinit var etMaxTemp: EditText
            private lateinit var etConditions: EditText
            private lateinit var tvMessage: TextView

            private lateinit var btnSave: Button
            private lateinit var btnClear: Button
            private lateinit var btnExit: Button

            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_mainscreen)

                etDay = findViewById(R.id.et_day)
                etMinTemp = findViewById(R.id.et_min_temp)
                etMaxTemp = findViewById(R.id.et_max_temp)
                etConditions = findViewById(R.id.et_conditions)
                tvMessage = findViewById(R.id.tv_message)

                btnSave = findViewById(R.id.btn_save)
                btnClear = findViewById(R.id.btn_clear)
                btnExit = findViewById(R.id.btn_exit)
                btnNext = findViewById(R.id.btn_next)

                btnSave.setOnClickListener {
                    val day = etDay.text.toString()
                    val minTemp = etMinTemp.text.toString().toFloatOrNull()
                    val maxTemp = etMaxTemp.text.toString().toFloatOrNull()
                    val conditions = etConditions.text.toString()

                    if (day.isEmpty() || minTemp == null || maxTemp == null || conditions.isEmpty()) {
                        tvMessage.text = "Please fill all fields"
                        return@setOnClickListener
                    }

                    dayList.add(day)
                    minTempList.add(minTemp)
                    maxTempList.add(maxTemp)
                    weatherList.add(conditions)

                    tvMessage.text = "Saved"
                }

                btnClear.setOnClickListener {
                    etDay.text.clear()
                    etMinTemp.text.clear()
                    etMaxTemp.text.clear()
                    etConditions.text.clear()
                    tvMessage.text = ""
                }

                btnNext.setOnClickListener {
                    if (dayList.isNotEmpty()) {
                        val intent = Intent(this, detailedviewscreen::class.java).apply {
                            putStringArrayListExtra("days", ArrayList(dayList))
                            putExtra("min_temps", minTempList.toFloatArray())
                            putExtra("max_temps", maxTempList.toFloatArray())
                            putStringArrayListExtra("conditions", ArrayList(weatherList))
                        }
                        startActivity(intent)
                    } else {
                        tvMessage.text = "No data to show"
                    }
                }

                btnExit.setOnClickListener {
                    finish()

        }



    }
    }

