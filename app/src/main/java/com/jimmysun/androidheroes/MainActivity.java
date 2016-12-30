package com.jimmysun.androidheroes;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.jimmysun.androidheroes.chapter10.Chapter10Activity;
import com.jimmysun.androidheroes.chapter11.BmobActivity;
import com.jimmysun.androidheroes.chapter12.Chapter12Activity;
import com.jimmysun.androidheroes.chapter3.CustomViewActivity;
import com.jimmysun.androidheroes.chapter4.Chapter4Activity;
import com.jimmysun.androidheroes.chapter5.Chapter5Activity;
import com.jimmysun.androidheroes.chapter6.Chapter6Activity;
import com.jimmysun.androidheroes.chapter7.Chapter7Activity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button customViewButton = (Button) findViewById(R.id.btn_custom_view);
        if (customViewButton != null) {
            customViewButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this, CustomViewActivity.class);
                    startActivity(intent);
                }
            });
        }
        Button listViewButton = (Button) findViewById(R.id.btn_list_view);
        if (listViewButton != null) {
            listViewButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this, Chapter4Activity.class);
                    startActivity(intent);
                }
            });
        }
        Button scrollButton = (Button) findViewById(R.id.btn_scroll);
        if (scrollButton != null) {
            scrollButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this, Chapter5Activity.class);
                    startActivity(intent);
                }
            });
        }
        Button drawButton = (Button) findViewById(R.id.btn_draw);
        if (drawButton != null) {
            drawButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this, Chapter6Activity.class);
                    startActivity(intent);
                }
            });
        }
        Button animatorButton = (Button) findViewById(R.id.btn_animator);
        if (animatorButton != null) {
            animatorButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this, Chapter7Activity.class);
                    startActivity(intent);
                }
            });
        }
        Button performanceOptimizeButton = (Button) findViewById(R.id.btn_performance_optimize);
        if (performanceOptimizeButton != null) {
            performanceOptimizeButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this, Chapter10Activity.class);
                    startActivity(intent);
                }
            });
        }
        Button bmobButton = (Button) findViewById(R.id.btn_bmob);
        if (bmobButton != null) {
            bmobButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this, BmobActivity.class);
                    startActivity(intent);
                }
            });
        }
        Button androidLButton = (Button) findViewById(R.id.btn_androidl);
        if (androidLButton != null) {
            androidLButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this, Chapter12Activity.class);
                    startActivity(intent);
                }
            });
        }
    }
}
