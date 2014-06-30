package com.chrislacy.webviewdropdownissue;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainService extends Service {

    @Override
    public IBinder onBind(Intent intent) {
       return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (MainActivity.sInstance != null) {
                    final WebView webView = new WebView(MainService.this);

                    webView.setLayoutParams(MainActivity.sInstance.mFrameLayout.getLayoutParams());
                    webView.setWebContentsDebuggingEnabled(true);

                    webView.setWebViewClient(new WebViewClient() {
                        @Override
                        public boolean shouldOverrideUrlLoading(WebView webView, String url) {
                            //super.shouldOverrideUrlLoading(webView, url);
                            webView.loadUrl(url);
                            return false;
                        }
                    });

                    ViewGroup parent = (ViewGroup) MainActivity.sInstance.mFrameLayout.getParent();
                    int index = parent.indexOfChild(MainActivity.sInstance.mFrameLayout);
                    parent.removeView(MainActivity.sInstance.mFrameLayout);
                    parent.addView(webView, index);

                    webView.loadUrl("http://s3.amazonaws.com/linkbubble/test_page.html");
                }
            }
        }, 2000);

        return START_STICKY;
    }

}
