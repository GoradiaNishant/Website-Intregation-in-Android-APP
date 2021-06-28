package com.store.atozcollection;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    WebView wb1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        wb1=findViewById(R.id.webview);
        wb1.setWebViewClient(new WebViewClient());
        wb1.clearCache(true);
        wb1.getSettings().getAllowContentAccess();
        wb1.getSettings().getLoadsImagesAutomatically();
        wb1.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        wb1.getSettings().setDomStorageEnabled(true);
        wb1.getSettings().setJavaScriptEnabled(true);
//        webSettings.setJavaScriptEnabled(true);
//        webSettings.setAppCacheEnabled(true);
        wb1.loadUrl("http://atozcollection.co.in/");

    }

    public void onBackPressed() {
        if (wb1.canGoBack()) {
            wb1.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
