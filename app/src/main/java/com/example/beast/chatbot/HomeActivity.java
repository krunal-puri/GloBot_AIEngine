package com.example.beast.chatbot;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;

public class HomeActivity extends AppCompatActivity {

    CardView lay_chat, lay_capture, lay_tensor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        lay_chat = findViewById(R.id.lay_chat);
        lay_capture = findViewById(R.id.lay_capture);
        lay_tensor = findViewById(R.id.lay_tensor);

        lay_chat.setOnClickListener(v -> {
            Intent intent_chat = new Intent(HomeActivity.this, MainActivity.class);
            startActivity(intent_chat);
            overridePendingTransition(R.anim.slide_out, R.anim.slide_in);
        });

        lay_capture.setOnClickListener(v -> {
            Intent intent_capture = new Intent(HomeActivity.this, CaptureActivity.class);
            startActivity(intent_capture);
            overridePendingTransition(R.anim.slide_out, R.anim.slide_in);
        });
    }
}
