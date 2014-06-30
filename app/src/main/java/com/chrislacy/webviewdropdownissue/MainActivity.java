package com.chrislacy.webviewdropdownissue;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;


public class MainActivity extends Activity {

    static MainActivity sInstance = null;

    FrameLayout mFrameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFrameLayout = (FrameLayout) findViewById(R.id.web_view_container);

        sInstance = this;

        Intent serviceIntent = new Intent(MainActivity.this, MainService.class);
        startService(serviceIntent);
    }

    @Override
    public void onResume() {
        super.onResume();
    }

}
