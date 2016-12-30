package com.jimmysun.androidheroes.chapter12;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.jimmysun.androidheroes.R;

public class AnimatedSelectorActivity extends AppCompatActivity {
    private static final int[] STATE_CHECKED = new int[]{android.R.attr.state_checked};
    private static final int[] STATE_UNCHECKED = new int[]{};
    private boolean mIsCheck;
    private ImageView mPlusDoneImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animated_selector);
        mPlusDoneImageView = (ImageView) findViewById(R.id.iv_plus_done);
        mPlusDoneImageView.setImageDrawable(getResources().getDrawable(R.drawable.anim_plus_done,
                null));
        mPlusDoneImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mIsCheck) {
                    mPlusDoneImageView.setImageState(STATE_UNCHECKED, true);
                    mIsCheck = false;
                } else {
                    mPlusDoneImageView.setImageState(STATE_CHECKED, true);
                    mIsCheck = true;
                }
            }
        });
    }
}
