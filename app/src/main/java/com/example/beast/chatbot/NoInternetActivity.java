package com.example.beast.chatbot;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


/**
 * Created by anjal on 09/07/2017.
 */
public class NoInternetActivity extends AppCompatActivity {

    TextView lbl_ok;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_no_internet);

        lbl_ok= (TextView) findViewById(R.id.lbl_ok);
        lbl_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
