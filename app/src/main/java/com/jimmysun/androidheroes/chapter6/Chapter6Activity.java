package com.jimmysun.androidheroes.chapter6;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.jimmysun.androidheroes.R;

public class Chapter6Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter6);
        Button shapeButton = (Button) findViewById(R.id.btn_shape);
        if (shapeButton != null) {
            shapeButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Chapter6Activity.this, ShapeActivity.class);
                    startActivity(intent);
                }
            });
        }
        Button layerButton = (Button) findViewById(R.id.btn_layer);
        if (layerButton != null) {
            layerButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Chapter6Activity.this, LayerActivity.class);
                    startActivity(intent);
                }
            });
        }
        Button clockButton = (Button) findViewById(R.id.btn_clock);
        if (clockButton != null) {
            clockButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Chapter6Activity.this, ClockActivity.class);
                    startActivity(intent);
                }
            });
        }
        Button layerCoverageButton = (Button) findViewById(R.id.btn_layer_coverage);
        if (layerCoverageButton != null) {
            layerCoverageButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Chapter6Activity.this, LayerCoverageActivity.class);
                    startActivity(intent);
                }
            });
        }
        Button colorMatrixButton = (Button) findViewById(R.id.btn_color_matrix);
        if (colorMatrixButton != null) {
            colorMatrixButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Chapter6Activity.this, ColorMatrixActivity.class);
                    startActivity(intent);
                }
            });
        }
        Button cornerImageButton = (Button) findViewById(R.id.btn_corner_image);
        if (cornerImageButton != null) {
            cornerImageButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Chapter6Activity.this, CornerImageActivity.class);
                    startActivity(intent);
                }
            });
        }
        Button scratchCardButton = (Button) findViewById(R.id.btn_scratch_card);
        if (scratchCardButton != null) {
            scratchCardButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Chapter6Activity.this, XfermodeActivity.class);
                    startActivity(intent);
                }
            });
        }
        Button bitmapShaderButton = (Button) findViewById(R.id.btn_bitmap_shader);
        if (bitmapShaderButton != null) {
            bitmapShaderButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Chapter6Activity.this, BitmapShaderActivity.class);
                    startActivity(intent);
                }
            });
        }
        Button linearGradientButton = (Button) findViewById(R.id.btn_linear_gradient);
        if (linearGradientButton != null) {
            linearGradientButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Chapter6Activity.this, LinearGradientActivity.class);
                    startActivity(intent);
                }
            });
        }
        Button reflectButton = (Button) findViewById(R.id.btn_reflect);
        if (reflectButton != null) {
            reflectButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Chapter6Activity.this, ReflectActivity.class);
                    startActivity(intent);
                }
            });
        }
        Button pathEffectButton = (Button) findViewById(R.id.btn_path_effect);
        if (pathEffectButton != null) {
            pathEffectButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Chapter6Activity.this, PathEffectActivity.class);
                    startActivity(intent);
                }
            });
        }
        Button sinButton = (Button) findViewById(R.id.btn_sin);
        if (sinButton != null) {
            sinButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Chapter6Activity.this, SinActivity.class);
                    startActivity(intent);
                }
            });
        }
        Button drawingBoardButton = (Button) findViewById(R.id.btn_drawing_board);
        if (drawingBoardButton != null) {
            drawingBoardButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Chapter6Activity.this, DrawingBoardActivity.class);
                    startActivity(intent);
                }
            });
        }
    }
}
