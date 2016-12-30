package com.jimmysun.androidheroes.chapter12;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.graphics.Palette;

import com.jimmysun.androidheroes.R;

public class PaletteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palette);
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.test2);
        Palette.from(bitmap).generate(new Palette.PaletteAsyncListener() {
            @Override
            public void onGenerated(Palette palette) {
                Palette.Swatch swatch = palette.getDarkVibrantSwatch();
                if (swatch != null) {
                    getSupportActionBar().setBackgroundDrawable(new ColorDrawable(swatch.getRgb()));
                    getWindow().setStatusBarColor(swatch.getRgb());
                }
            }
        });
    }
}
