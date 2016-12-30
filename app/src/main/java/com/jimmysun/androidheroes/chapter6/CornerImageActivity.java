package com.jimmysun.androidheroes.chapter6;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class CornerImageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new CornerImageView(this));
    }
}
