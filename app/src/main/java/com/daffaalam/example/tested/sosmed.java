package com.daffaalam.example.tested;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class sosmed extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sosmed);

        Intent gets = getIntent();

        String link = gets.getStringExtra("Link");

        WebView webssmd = (WebView)findViewById(R.id.websos);
        WebSettings wbset = webssmd.getSettings();
        wbset.setJavaScriptEnabled(true);
        webssmd.setWebViewClient(new WebViewClient());
        webssmd.loadUrl("http://" + link);

    }

    public void backs(View view) {
        Intent ntn = new Intent(sosmed.this, main.class);
        startActivity(ntn);
    }
}
