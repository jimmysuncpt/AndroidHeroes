package com.jimmysun.androidheroes.chapter7;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.jimmysun.androidheroes.R;

public class AnimTrickActivity extends AppCompatActivity {
    private ImageView mAnimTrickImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anim_trick);
        mAnimTrickImageView = (ImageView) findViewById(R.id.iv_anim_trick);
        mAnimTrickImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Drawable drawable = mAnimTrickImageView.getDrawable();
                if (drawable instanceof Animatable) {
                    ((Animatable) drawable).start();
                }
            }
        });
    }
}
