package com.example.beast.chatbot;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashActivity extends AppCompatActivity {

    Animation anim_zoom_out, anim_zoom_in;
    ImageView img_splash, img_mic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        img_splash = findViewById(R.id.img_splash);
        img_mic = findViewById(R.id.img_mic);


        anim_zoom_out = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.anim_zoom_out_bounce);
        anim_zoom_in = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.anim_zoom_in);


        img_mic.setVisibility(View.VISIBLE);
        img_mic.startAnimation(anim_zoom_in);

        anim_zoom_in.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                img_mic.setVisibility(View.GONE);
                img_splash.setVisibility(View.VISIBLE);
                img_splash.startAnimation(anim_zoom_out);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });


        anim_zoom_out.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                Intent intent_new = new Intent(SplashActivity.this, HomeActivity.class);
                startActivity(intent_new);
                overridePendingTransition(R.anim.slide_out, R.anim.slide_in);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
    }


    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
