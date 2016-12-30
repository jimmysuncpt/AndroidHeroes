package com.jimmysun.androidheroes.chapter12;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.jimmysun.androidheroes.R;

public class Chapter12Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter12);
        Button paletteButton = (Button) findViewById(R.id.btn_palette);
        paletteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Chapter12Activity.this, PaletteActivity.class);
                startActivity(intent);
            }
        });
        Button shadowButton = (Button) findViewById(R.id.btn_shadow);
        shadowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Chapter12Activity.this, ShadowActivity.class);
                startActivity(intent);
            }
        });
        Button tintingButton = (Button) findViewById(R.id.btn_tinting);
        tintingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Chapter12Activity.this, TintingActivity.class);
                startActivity(intent);
            }
        });
        Button clippingButton = (Button) findViewById(R.id.btn_clipping);
        clippingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Chapter12Activity.this, ClippingActivity.class);
                startActivity(intent);
            }
        });
        Button recyclerViewButton = (Button) findViewById(R.id.btn_recycler_view);
        recyclerViewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Chapter12Activity.this, RecyclerActivity.class);
                startActivity(intent);
            }
        });
        Button cardViewButton = (Button) findViewById(R.id.btn_card_view);
        cardViewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Chapter12Activity.this, CardViewActivity.class);
                startActivity(intent);
            }
        });
        Button transitionButton = (Button) findViewById(R.id.btn_transition);
        transitionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Chapter12Activity.this, TransitionActivity.class);
                startActivity(intent);
            }
        });
        Button rippleButton = (Button) findViewById(R.id.btn_ripple);
        rippleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Chapter12Activity.this, RippleActivity.class);
                startActivity(intent);
            }
        });
        Button circularRevealButton = (Button) findViewById(R.id.btn_circular_reveal);
        circularRevealButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Chapter12Activity.this, CircularRevealActivity.class);
                startActivity(intent);
            }
        });
        Button stateListAnimatorButton = (Button) findViewById(R.id.btn_state_list_animator);
        stateListAnimatorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Chapter12Activity.this, StateListAnimatorActivity.class);
                startActivity(intent);
            }
        });
        Button animatedSelectorButton = (Button) findViewById(R.id.btn_animated_selector);
        animatedSelectorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Chapter12Activity.this, AnimatedSelectorActivity.class);
                startActivity(intent);
            }
        });
        Button toolbarButton = (Button) findViewById(R.id.btn_toolbar);
        toolbarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Chapter12Activity.this, ToolbarActivity.class);
                startActivity(intent);
            }
        });
        Button notificationButton = (Button) findViewById(R.id.btn_notification);
        notificationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Chapter12Activity.this, NotificationActivity.class);
                startActivity(intent);
            }
        });
    }
}
