package com.example.uts8020200128

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient

class WebviewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_webview)

        var url = "https://google.com"
        var webview = findViewById<WebView>(R.id.webview)
        webview.webViewClient = WebViewClient()
        val webSettings: WebSettings = webview.settings
        webSettings.javaScriptEnabled = true
        webview.loadUrl(url)

    }
}