package com.jimmysun.androidheroes.chapter7;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.jimmysun.androidheroes.R;

public class CustomAnimationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_animation);
        ImageView tvCloseImageView = (ImageView) findViewById(R.id.iv_tv_close);
        if (tvCloseImageView != null) {
            tvCloseImageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    TVCloseAnimation tvCloseAnimation = new TVCloseAnimation();
                    v.startAnimation(tvCloseAnimation);
                }
            });
        }
        Button rotateButton = (Button) findViewById(R.id.btn_rotate);
        if (rotateButton != null) {
            rotateButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    CustomRotateAnimation rotateAnimation = new CustomRotateAnimation();
                    rotateAnimation.setRotateY(400);
                    v.startAnimation(rotateAnimation);
                }
            });
        }
    }
}
