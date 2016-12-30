package com.jimmysun.androidheroes.chapter7;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.jimmysun.androidheroes.R;

public class Chapter7Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter7);
        Button viewAnimationButton = (Button) findViewById(R.id.btn_view_animation);
        if (viewAnimationButton != null) {
            viewAnimationButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Chapter7Activity.this, ViewAnimationActivity.class);
                    startActivity(intent);
                }
            });
        }
        Button objectAnimatorButton = (Button) findViewById(R.id.btn_object_animator);
        if (objectAnimatorButton != null) {
            objectAnimatorButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Chapter7Activity.this, ObjectAnimatorActivity.class);
                    startActivity(intent);
                }
            });
        }
        Button customAnimatorButton = (Button) findViewById(R.id.btn_custom_animation);
        if (customAnimatorButton != null) {
            customAnimatorButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Chapter7Activity.this, CustomAnimationActivity
                            .class);
                    startActivity(intent);
                }
            });
        }
        Button svgButton = (Button) findViewById(R.id.btn_svg);
        if (svgButton != null) {
            svgButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Chapter7Activity.this, SVGActivity.class);
                    startActivity(intent);
                }
            });
        }
        Button animTrickButton = (Button) findViewById(R.id.btn_anim_trick);
        if (animTrickButton != null) {
            animTrickButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Chapter7Activity.this, AnimTrickActivity.class);
                    startActivity(intent);
                }
            });
        }
        Button sunMoonEarthButton = (Button) findViewById(R.id.btn_sun_moon_earth);
        if (sunMoonEarthButton != null) {
            sunMoonEarthButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Chapter7Activity.this, SunMoonEarthActivity.class);
                    startActivity(intent);
                }
            });
        }
        Button searchbarButton = (Button) findViewById(R.id.btn_searchbar);
        if (searchbarButton != null) {
            searchbarButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Chapter7Activity.this, SearchbarActivity.class);
                    startActivity(intent);
                }
            });
        }
        Button animMenuButton = (Button) findViewById(R.id.btn_anim_menu);
        if (animMenuButton != null) {
            animMenuButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Chapter7Activity.this, AnimMenuActivity.class);
                    startActivity(intent);
                }
            });
        }
        Button timerButton = (Button) findViewById(R.id.btn_timer);
        if (timerButton != null) {
            timerButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Chapter7Activity.this, TimerActivity.class);
                    startActivity(intent);
                }
            });
        }
        Button dropButton = (Button) findViewById(R.id.btn_drop);
        if (dropButton != null) {
            dropButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Chapter7Activity.this, DropActivity.class);
                    startActivity(intent);
                }
            });
        }
    }
}
