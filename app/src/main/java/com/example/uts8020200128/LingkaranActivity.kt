package com.example.uts8020200128

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class LingkaranActivity : AppCompatActivity() {
    lateinit var buttonCalculate:Button
    lateinit var editTextRadius:EditText;
    lateinit var textViewResult:TextView;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lingkaran)
        buttonCalculate = findViewById(R.id.buttonCalculate)
        editTextRadius = findViewById(R.id.editTextRadius)
        textViewResult  = findViewById(R.id.textViewResult)

        buttonCalculate.setOnClickListener {
            hitungLuasLingkaran()
        }
    }

    private fun hitungLuasLingkaran() {
        val radiusStr = editTextRadius.text.toString()

        if (radiusStr.isNotEmpty()) {
            val radius = radiusStr.toDouble()
            val area = calculateArea(radius)
            textViewResult.text = area.toString()
        } else {
            textViewResult.text = "Masukkan jari-jari terlebih dahulu"
        }
    }

    private fun calculateArea(radius: Double): Double {
        //if radius habis dibagi 7
        if (radius % 7 == 0.0) {
            return 22.0 / 7.0 * radius * radius
        }else{
            return Math.PI * radius * radius
        }
    }
}