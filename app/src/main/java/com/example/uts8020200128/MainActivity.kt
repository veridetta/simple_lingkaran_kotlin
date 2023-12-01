package com.example.uts8020200128

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.show()
        supportActionBar?.title = "Activity 1"
        val nimToMatch = "8020200128"

        val editTextNIM = findViewById<EditText>(R.id.editTextNIM)
        val buttonLogin = findViewById<Button>(R.id.buttonLogin)

        buttonLogin.setOnClickListener {
            val inputNIM = editTextNIM.text.toString()

            if (inputNIM == nimToMatch) {
                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
                finish()
            } else {
                Toast.makeText(this, "Login salah", Toast.LENGTH_SHORT).show()
            }
        }
    }
}