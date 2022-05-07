package com.example.signupuijava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        initViews();
    }

    void initViews() {
        countDownTimer();
    }

    void countDownTimer() {
        new CountDownTimer(2000, 1000) {

            @Override
            public void onTick(long l) {

            }

            @Override
            public void onFinish() {
                openActivity();
            }
        }.start();
    }

    void openActivity() {
        Intent intent = new Intent(this, SignInActivity.class);
        startActivity(intent);
        finish();
    }
}