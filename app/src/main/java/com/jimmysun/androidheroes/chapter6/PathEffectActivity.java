package com.jimmysun.androidheroes.chapter6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class PathEffectActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new PathEffectView(this));
    }
}
