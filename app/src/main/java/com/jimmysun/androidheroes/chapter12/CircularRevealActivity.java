package com.jimmysun.androidheroes.chapter12;

import android.animation.Animator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.widget.ImageView;

import com.jimmysun.androidheroes.R;

public class CircularRevealActivity extends AppCompatActivity {
    private ImageView mOvalImageView, mRectImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circular_reveal);
        mOvalImageView = (ImageView) findViewById(R.id.iv_oval);
        mOvalImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animator animator = ViewAnimationUtils.createCircularReveal(mOvalImageView,
                        mOvalImageView.getWidth() / 2, mOvalImageView.getHeight() / 2,
                        mOvalImageView.getWidth(), 0);
                animator.setInterpolator(new AccelerateDecelerateInterpolator());
                animator.setDuration(2000);
                animator.start();
            }
        });
        mRectImageView = (ImageView) findViewById(R.id.iv_rect);
        mRectImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animator animator = ViewAnimationUtils.createCircularReveal(mRectImageView, 0, 0,
                        0, (float) Math.hypot(mRectImageView.getWidth(), mRectImageView.getHeight
                                ()));
                animator.setInterpolator(new AccelerateInterpolator());
                animator.setDuration(2000);
                animator.start();
            }
        });
    }
}
