package com.jimmysun.androidheroes.chapter7;

import android.graphics.drawable.Animatable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.jimmysun.androidheroes.R;

public class SunMoonEarthActivity extends AppCompatActivity {
    private ImageView mSunMoonEarthImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sun_moon_earth);
        mSunMoonEarthImageView = (ImageView) findViewById(R.id.iv_sun_moon_earth);
        if (mSunMoonEarthImageView != null) {
            mSunMoonEarthImageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ((Animatable) mSunMoonEarthImageView.getDrawable()).start();
                }
            });
        }
    }
}
