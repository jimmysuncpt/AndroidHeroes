package com.jimmysun.androidheroes.chapter6;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by jimmy on 2016/12/13 0013
 */

public class XfermodeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new XfermodeView(this));
    }
}
