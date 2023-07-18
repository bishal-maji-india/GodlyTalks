package com.bishal.godlytalks.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.bishal.godlytalks.R;
import com.bishal.godlytalks.util.handler.DelayStartActivity;

public class SplashScreen extends AppCompatActivity {
    private boolean isLoggedIn=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        if (isLoggedIn){
            DelayStartActivity.delayedStart(this, 3000, HomeActivity.class,true);
        }else{
            DelayStartActivity.delayedStart(this, 3000, Login.class,true);
        }

    }
}