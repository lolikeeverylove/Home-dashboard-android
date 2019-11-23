package com.example.myapplication.ui.old;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.myapplication.MainActivity;
import com.example.myapplication.R;

public class splashActivity extends Activity {

    private final int SPLASH_DISPLAY_LENGHT = 2000;



    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main3);

        new Handler().postDelayed(new Runnable() {

            @Override

            public void run() {

                Intent mainIntent = new Intent(splashActivity.this, MainActivity.class);

                splashActivity.this.startActivity(mainIntent);

                splashActivity.this.finish();

            }

        }, SPLASH_DISPLAY_LENGHT);

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
