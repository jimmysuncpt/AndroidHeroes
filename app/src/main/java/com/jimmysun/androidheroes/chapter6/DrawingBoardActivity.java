package com.jimmysun.androidheroes.chapter6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DrawingBoardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new DrawingBoardSurfaceView(this));
    }
}
