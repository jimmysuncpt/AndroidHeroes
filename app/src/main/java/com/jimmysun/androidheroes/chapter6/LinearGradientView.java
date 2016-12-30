package com.jimmysun.androidheroes.chapter6;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by jimmy on 2016/12/13 0013
 */

public class LinearGradientView extends View {
    public LinearGradientView(Context context) {
        super(context);
    }

    public LinearGradientView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public LinearGradientView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        Paint paint = new Paint();
        paint.setShader(new LinearGradient(0, 0, 400, 400, Color.BLUE, Color.RED, Shader.TileMode.REPEAT));
        canvas.drawRect(0, 0, 700, 700, paint);
    }
}
