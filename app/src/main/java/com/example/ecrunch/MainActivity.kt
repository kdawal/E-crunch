package com.example.ecrunch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val webView = findViewById<WebView>(R.id.webView)

        webView.webViewClient = WebViewClient()
        webView.loadUrl("https://www.ecrunch.ga")

        val webSettings = webView.settings
        webSettings.javaScriptEnabled = true
    }
}
