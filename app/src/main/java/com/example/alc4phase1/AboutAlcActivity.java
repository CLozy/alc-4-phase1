package com.example.alc4phase1;

import android.net.http.SslError;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class AboutAlcActivity extends AppCompatActivity {

    private WebView cWebview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_alc);

        getSupportActionBar().setTitle("About Alc");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        cWebview = (WebView)findViewById(R.id.alc_page_view);
        cWebview.loadUrl("http://andela.com/alc/");
        cWebview.getSettings().setBlockNetworkLoads(false);
        cWebview.setWebViewClient(new WvClient());

    }
    private class WvClient extends WebViewClient {
        @Override
        public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
            handler.proceed();

        }
    }

}
