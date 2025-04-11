package com.iltrons.os;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        webView = new WebView(this);
        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setJavaScriptEnabled(true);

        // Replace this with your actual GitHub raw link
        webView.loadUrl("https://raw.githubusercontent.com/YOUR_USERNAME/YOUR_REPO/main/index.html");

        setContentView(webView);
    }
}