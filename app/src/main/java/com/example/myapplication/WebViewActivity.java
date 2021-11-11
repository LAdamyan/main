package com.example.myapplication;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class WebViewActivity extends AppCompatActivity {




    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.web_view_layout);
        initWebView();

    }

    private void initWebView() {
        WebView webView = findViewById(R.id.webView);
       webView.loadUrl("https://medium.com");
       WebSettings settings = webView.getSettings();
       settings.setJavaScriptEnabled(true);

       MyWebViewClient myWebViewClient = new MyWebViewClient();
       webView.setWebViewClient(myWebViewClient);



    }
    private class MyWebViewClient extends WebViewClient {
        boolean mIsPageFinished = true;


        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            super.onPageStarted(view, url, favicon);
            Toast.makeText(WebViewActivity.this,"", Toast.LENGTH_LONG).show();
            mIsPageFinished = false;
        }

        @Override
        public void onPageFinished(WebView view, String url) {
            super.onPageFinished(view, url);
            mIsPageFinished = true;
        }


    }



    }
