package com.example.signupuijava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SignInActivity extends AppCompatActivity {
    Button bt_up;
    TextView tv_signUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        bt_up = findViewById(R.id.bt_up);
        tv_signUp = findViewById(R.id.tv_signUp);
        tv_signUp.setOnClickListener(view -> openSignUp());
        bt_up.setOnClickListener(view -> openActivity());
    }

    void openActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    void openSignUp() {
        Intent intent = new Intent(this, SignUpActivity.class);
        startActivity(intent);
        finish();
    }


}