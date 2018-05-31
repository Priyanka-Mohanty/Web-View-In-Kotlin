package com.priyankam.webviewinkotlin

import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebSettings
import kotlinx.android.synthetic.main.activity_main.*
//Using R.layout.activity_main from the 'main' source set
import kotlinx.android.synthetic.main.activity_main.view.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var url = "https://www.walmart.com"
        webview.settings.javaScriptEnabled = true
        //boolean: true if the WebView should use the DOM storage API, which allows the application to store page elements that could include user sensitive information.
        // If webview screen is blank then setDomStorageEnabled :True bydefault is false
        webview.settings.domStorageEnabled = true
        webview.settings.allowFileAccess = true
        webview.settings.setAppCacheEnabled(true)
        webview.settings.setSupportMultipleWindows(true)
        webview.settings.allowContentAccess = true
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
            webview.settings.allowFileAccessFromFileURLs = true
        }
        webview.settings.javaScriptCanOpenWindowsAutomatically = true
        webview.settings.useWideViewPort = true
        webview.settings.loadWithOverviewMode = true
        // The app performs better with these
        webview.settings.cacheMode = WebSettings.LOAD_NO_CACHE
        webview.loadUrl(url)

    }
}
