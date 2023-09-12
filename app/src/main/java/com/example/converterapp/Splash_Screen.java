package com.example.converterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import java.time.Duration;

public class Splash_Screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);


        ImageView splash_logo = findViewById(R.id.splash_logo);

        Animation splash_animation = AnimationUtils.loadAnimation(this, R.anim.splash_animation);

        splash_logo.startAnimation(splash_animation);

        Intent splash_intent = new Intent(Splash_Screen.this, MainActivity.class);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(splash_intent);
                finish();
            }
        }, 3000);

    statusbarColour();


    }

    private void statusbarColour(){

        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M)
        {
            getWindow().setStatusBarColor(getResources().getColor(R.color.splash_bg, this.getTheme()));
        }
    }
}