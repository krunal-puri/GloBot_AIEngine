package com.example.beast.chatbot;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

public class AboutActivity extends AppCompatActivity {

    TextView aboutText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        Toolbar toolbarInAbout = findViewById(R.id.toolbarInAbout);
        toolbarInAbout.setTitle("About");
        toolbarInAbout.setNavigationIcon(R.drawable.ic_arrow_back);
        toolbarInAbout.setNavigationOnClickListener(v -> onBackPressed());

        TextView aboutText = findViewById(R.id.aboutText);
        aboutText.setText(getString(R.string.about));
    }
}
