package com.jimmysun.androidheroes.chapter7;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.jimmysun.androidheroes.R;

public class DropActivity extends AppCompatActivity {
    private LinearLayout mHiddenLayout;
    private int mHiddenViewMeasuredHeight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drop);
        mHiddenLayout = (LinearLayout) findViewById(R.id.layout_hidden);
        float density = getResources().getDisplayMetrics().density;
        mHiddenViewMeasuredHeight = (int) (density * 40 + 0.5);
        LinearLayout clickLayout = (LinearLayout) findViewById(R.id.layout_click);
        if (clickLayout != null) {
            clickLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (mHiddenLayout.getVisibility() == View.GONE) {
                        animateOpen(mHiddenLayout);
                    } else {
                        animateClose(mHiddenLayout);
                    }
                }
            });
        }
    }

    private ValueAnimator createDropAnimator(final View view, int start, int end) {
        ValueAnimator animator = ValueAnimator.ofInt(start, end);
        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                int value = (int) animation.getAnimatedValue();
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.height = value;
                view.setLayoutParams(layoutParams);
            }
        });
        return animator;
    }

    private void animateOpen(View view) {
        view.setVisibility(View.VISIBLE);
        ValueAnimator animator = createDropAnimator(view, 0, mHiddenViewMeasuredHeight);
        animator.start();
    }

    private void animateClose(final View view) {
        ValueAnimator animator = createDropAnimator(view, view.getHeight(), 0);
        animator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animation) {
                view.setVisibility(View.GONE);
            }
        });
        animator.start();
    }
}
