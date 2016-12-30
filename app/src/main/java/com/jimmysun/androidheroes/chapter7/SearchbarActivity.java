package com.jimmysun.androidheroes.chapter7;

import android.graphics.drawable.Animatable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.jimmysun.androidheroes.R;

public class SearchbarActivity extends AppCompatActivity {
    private ImageView mSearchbarImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_searchbar);
        mSearchbarImageView = (ImageView) findViewById(R.id.iv_searchbar);
        if (mSearchbarImageView != null) {
            mSearchbarImageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ((Animatable)mSearchbarImageView.getDrawable()).start();
                }
            });
        }
    }
}
