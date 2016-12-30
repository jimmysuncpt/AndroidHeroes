package com.jimmysun.androidheroes.chapter5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.jimmysun.androidheroes.R;

public class Chapter5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter5);
        Button dragButton = (Button) findViewById(R.id.btn_drag);
        if (dragButton != null) {
            dragButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Chapter5Activity.this, DragActivity.class);
                    startActivity(intent);
                }
            });
        }
        Button sideslipButton = (Button) findViewById(R.id.btn_sideslip);
        if (sideslipButton != null) {
            sideslipButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Chapter5Activity.this, DragViewGroupActivity.class);
                    startActivity(intent);
                }
            });
        }
    }
}
