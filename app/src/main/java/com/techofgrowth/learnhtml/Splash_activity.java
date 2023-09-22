package com.techofgrowth.learnhtml;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

public class Splash_activity extends AppCompatActivity {
    LottieAnimationView animation;
    TextView animText, text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        //Changing the color of statusBar icons in Light
        getWindow().getDecorView().setSystemUiVisibility(0);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
              startActivity(new Intent(Splash_activity.this, MainActivity.class));
              finish();
            }
        },2500);

        animText = findViewById(R.id.anim_text);
        text2 = findViewById(R.id.anim_text2);

        Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.second_logo_animation);
        animText.startAnimation(anim);
        text2.setAnimation(anim);



    }
}