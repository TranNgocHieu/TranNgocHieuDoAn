package com.appthongtinhou.appthongtin;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Main_WebView extends AppCompatActivity {
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__web_view);
        webView=(WebView)findViewById(R.id.webView);
        Intent intent=getIntent();
        String duonglink=intent.getStringExtra("linkdata");
        webView.loadUrl(duonglink);
        webView.setWebViewClient(new WebViewClient());

    }
}
