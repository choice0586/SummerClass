package com.example.summerclass;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity {

    // 3. Intent 부분
    TextView Hello;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        // 바퀴랑 엔진이랑 이어주기!
        Hello = findViewById(R.id.Hello);

        // content 받기!
        Intent intent = getIntent();
        String content = intent.getStringExtra("UserName");

        Hello.setText("Hello "+ content+"!");

    }
}