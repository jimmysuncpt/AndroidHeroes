package com.jimmysun.androidheroes.chapter7;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;

import com.jimmysun.androidheroes.R;

public class ViewAnimationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_animation);
        Button alphaButton = (Button) findViewById(R.id.btn_alpha);
        if (alphaButton != null) {
            alphaButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AlphaAnimation alphaAnimation = new AlphaAnimation(0, 1);
                    alphaAnimation.setDuration(1000);
                    v.startAnimation(alphaAnimation);
                }
            });
        }
        Button rotateButton = (Button) findViewById(R.id.btn_rotate);
        if (rotateButton != null) {
            rotateButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
//                    CustomRotateAnimation rotateAnimation = new CustomRotateAnimation(0, 360, 100, 100);
                    RotateAnimation rotateAnimation = new RotateAnimation(0, 360, RotateAnimation
                            .RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
                    rotateAnimation.setDuration(1000);
                    v.startAnimation(rotateAnimation);
                }
            });
        }
        Button translateButton = (Button) findViewById(R.id.btn_translate);
        if (translateButton != null) {
            translateButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    TranslateAnimation translateAnimation = new TranslateAnimation(0, 200, 0, 300);
                    translateAnimation.setDuration(1000);
                    v.startAnimation(translateAnimation);
                }
            });
        }
        Button scaleButton = (Button) findViewById(R.id.btn_scale);
        if (scaleButton != null) {
            scaleButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
//                    ScaleAnimation scaleAnimation = new ScaleAnimation(0, 2, 0, 2);
                    ScaleAnimation scaleAnimation = new ScaleAnimation(0, 1, 0, 1, Animation
                            .RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
                    scaleAnimation.setDuration(1000);
                    v.startAnimation(scaleAnimation);
                }
            });
        }
        Button setButton = (Button) findViewById(R.id.btn_set);
        if (setButton != null) {
            setButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AnimationSet animationSet = new AnimationSet(true);
                    animationSet.setDuration(1000);

                    AlphaAnimation alphaAnimation = new AlphaAnimation(0, 1);
                    alphaAnimation.setDuration(1000);
                    animationSet.addAnimation(alphaAnimation);

                    TranslateAnimation translateAnimation = new TranslateAnimation(0, 100, 0, 200);
                    translateAnimation.setDuration(1000);
                    animationSet.addAnimation(translateAnimation);

                    v.startAnimation(animationSet);
                }
            });
        }
    }
}
