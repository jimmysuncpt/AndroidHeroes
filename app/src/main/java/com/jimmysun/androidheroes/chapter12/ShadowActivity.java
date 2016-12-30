package com.jimmysun.androidheroes.chapter12;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.jimmysun.androidheroes.R;

public class ShadowActivity extends AppCompatActivity {
    private boolean flag = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shadow);
        TextView shadowTextView = (TextView) findViewById(R.id.tv_shadow);
        shadowTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag) {
                    v.animate().translationZ(100);
                    flag = false;
                } else {
                    v.animate().translationZ(0);
                    flag = true;
                }
            }
        });
    }
}
