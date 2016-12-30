package com.jimmysun.androidheroes.chapter6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class LinearGradientActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new LinearGradientView(this));
    }
}
