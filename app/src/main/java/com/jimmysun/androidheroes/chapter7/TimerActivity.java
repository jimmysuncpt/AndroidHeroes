package com.jimmysun.androidheroes.chapter7;

import android.animation.ValueAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;

import com.jimmysun.androidheroes.R;

public class TimerActivity extends AppCompatActivity {
    private TextView mTimerTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timer);
        mTimerTextView = (TextView) findViewById(R.id.tv_timer);
        mTimerTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ValueAnimator valueAnimator = ValueAnimator.ofInt(0, 59);
                valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public void onAnimationUpdate(ValueAnimator animation) {
                        int value = (int) animation.getAnimatedValue();
                        String stringValue = "00:";
                        if (value == 0) {
                            stringValue = stringValue + "00";
                        } else if (value < 10) {
                            stringValue = stringValue + "0" + value;
                        } else {
                            stringValue = stringValue + value;
                        }
                        mTimerTextView.setText(stringValue);
                    }
                });
                valueAnimator.setDuration(60000);
                valueAnimator.setInterpolator(new LinearInterpolator());
                valueAnimator.start();
            }
        });
    }
}
