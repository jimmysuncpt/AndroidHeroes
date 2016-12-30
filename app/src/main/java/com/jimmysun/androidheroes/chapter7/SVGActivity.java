package com.jimmysun.androidheroes.chapter7;

import android.graphics.drawable.Animatable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.jimmysun.androidheroes.R;

public class SVGActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_svg);
        ImageView animVectorImageView = (ImageView) findViewById(R.id.iv_anim_vector);
        if (animVectorImageView != null) {
            ((Animatable) animVectorImageView.getDrawable()).start();
        }
    }
}
