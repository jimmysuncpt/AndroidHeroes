package com.jimmysun.androidheroes.chapter7;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.BounceInterpolator;
import android.widget.ImageView;
import android.widget.Toast;

import com.jimmysun.androidheroes.R;

public class AnimMenuActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView[] mImageViews;
    private boolean mOpen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anim_menu);
        mImageViews = new ImageView[5];
        mImageViews[0] = (ImageView) findViewById(R.id.iv_a);
        mImageViews[1] = (ImageView) findViewById(R.id.iv_b);
        mImageViews[2] = (ImageView) findViewById(R.id.iv_c);
        mImageViews[3] = (ImageView) findViewById(R.id.iv_d);
        mImageViews[4] = (ImageView) findViewById(R.id.iv_e);
        for (ImageView mImageView : mImageViews) {
            mImageView.setOnClickListener(this);
        }
        mOpen = false;
    }

    private void startAnim() {
        ObjectAnimator animator0 = ObjectAnimator.ofFloat(mImageViews[0], "alpha", 1f, 0.5f);
        ObjectAnimator animator1 = ObjectAnimator.ofFloat(mImageViews[1], "translationY", 200f);
        ObjectAnimator animator2 = ObjectAnimator.ofFloat(mImageViews[2], "translationX", 200f);
        ObjectAnimator animator3 = ObjectAnimator.ofFloat(mImageViews[3], "translationY", -200f);
        ObjectAnimator animator4 = ObjectAnimator.ofFloat(mImageViews[4], "translationX", -200f);
        AnimatorSet set = new AnimatorSet();
        set.setDuration(500);
        set.setInterpolator(new BounceInterpolator());
        set.playTogether(animator0, animator1, animator2, animator3, animator4);
        set.start();
        mOpen = true;
    }

    private void closeAnim() {
        ObjectAnimator animator0 = ObjectAnimator.ofFloat(mImageViews[0], "alpha", 0.5f, 1f);
        ObjectAnimator animator1 = ObjectAnimator.ofFloat(mImageViews[1], "translationY", 0f);
        ObjectAnimator animator2 = ObjectAnimator.ofFloat(mImageViews[2], "translationX", 0f);
        ObjectAnimator animator3 = ObjectAnimator.ofFloat(mImageViews[3], "translationY", 0f);
        ObjectAnimator animator4 = ObjectAnimator.ofFloat(mImageViews[4], "translationX", 0f);
        AnimatorSet set = new AnimatorSet();
        set.setDuration(500);
        set.setInterpolator(new BounceInterpolator());
        set.playTogether(animator0, animator1, animator2, animator3, animator4);
        set.start();
        mOpen = false;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.iv_a:
                if (mOpen) {
                    closeAnim();
                } else {
                    startAnim();
                }
                break;
            default:
                Toast.makeText(AnimMenuActivity.this, "" + v.getId(), Toast.LENGTH_SHORT).show();
        }
    }
}
