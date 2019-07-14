package com.cruxapps.alc4phase1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.net.http.SslError;
import android.os.Bundle;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class AboutAlc extends AppCompatActivity {
private WebView alc_webview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_alc);

        alc_webview=findViewById(R.id.alc_webview);



        WebSettings webSettings=alc_webview.getSettings();
        alc_webview.getSettings().setJavaScriptEnabled(true);
        alc_webview.setWebViewClient(new WebViewClient(){
            @Override
            public void onReceivedSslError(WebView view, final  SslErrorHandler handler, SslError error) {
            final  AlertDialog.Builder builder =new AlertDialog.Builder(AboutAlc.this);

                builder.setMessage(R.string.ssl_error);
                builder.setPositiveButton("continue", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        handler.proceed();

                    }
                });
                builder.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        handler.cancel();
                    }
                });
                final AlertDialog dialog= builder.create();
                dialog.show();
            }
        });
        alc_webview.loadUrl("https://andela.com/alc/");



    }





}
