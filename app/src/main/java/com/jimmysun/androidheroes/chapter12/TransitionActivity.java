package com.jimmysun.androidheroes.chapter12;

import android.app.ActivityOptions;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.Button;

import com.jimmysun.androidheroes.R;

public class TransitionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transition);
        Button explodeButton = (Button) findViewById(R.id.btn_explode);
        explodeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TransitionActivity.this, TransitionActivity2.class);
                intent.putExtra("flag", 0);
                startActivity(intent, ActivityOptions.makeSceneTransitionAnimation
                        (TransitionActivity.this).toBundle());
            }
        });
        Button slideButton = (Button) findViewById(R.id.btn_slide);
        slideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TransitionActivity.this, TransitionActivity2.class);
                intent.putExtra("flag", 1);
                startActivity(intent, ActivityOptions.makeSceneTransitionAnimation
                        (TransitionActivity.this).toBundle());
            }
        });
        Button fadeButton = (Button) findViewById(R.id.btn_fade);
        fadeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TransitionActivity.this, TransitionActivity2.class);
                intent.putExtra("flag", 2);
                startActivity(intent, ActivityOptions.makeSceneTransitionAnimation
                        (TransitionActivity.this).toBundle());
            }
        });
        Button shareButton = (Button) findViewById(R.id.btn_share);
        shareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TransitionActivity.this, TransitionActivity2.class);
                intent.putExtra("flag", 3);
                // 创建单个共享元素
//                    startActivity(intent, ActivityOptions.makeSceneTransitionAnimation
//                            (TransitionActivity.this, v, "share").toBundle());
                // 创建多个共享元素
                View fab = findViewById(R.id.iv_fab);
                startActivity(intent, ActivityOptions.makeSceneTransitionAnimation
                        (TransitionActivity.this, Pair.create(v, "share"), Pair.create(fab,
                                "fab")).toBundle());
            }
        });
    }
}
