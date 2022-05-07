package com.example.signupuijava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class SignUpActivity extends AppCompatActivity {
    Button bt_up;
    TextView tv_signIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        bt_up = findViewById(R.id.bt_up);
        bt_up.setOnClickListener(view -> openActivity());
        tv_signIn = findViewById(R.id.tv_signIn);
        tv_signIn.setOnClickListener(view -> openSignIn());
    }

    void openActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    void openSignIn() {
        Intent intent = new Intent(this, SignInActivity.class);
        startActivity(intent);
        finish();
    }
}