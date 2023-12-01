package com.example.uts8020200128

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        supportActionBar?.show()
        supportActionBar?.title = "Activity 2"

        val buttonLuasLingkaran = findViewById<Button>(R.id.buttonLuasLingkaran)
        val buttonWebView = findViewById<Button>(R.id.buttonWebView)

        buttonLuasLingkaran.setOnClickListener {
            // Ketika tombol Luas Lingkaran ditekan, arahkan ke LingkaranActivity
            val intent = Intent(this, LingkaranActivity::class.java)
            startActivity(intent)
        }

        buttonWebView.setOnClickListener {
            // Ketika tombol WebView ditekan, arahkan ke WebViewActivity
            val intent = Intent(this, WebviewActivity::class.java)
            startActivity(intent)
        }
    }
}