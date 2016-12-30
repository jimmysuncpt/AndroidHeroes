package com.jimmysun.androidheroes.chapter6;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;

import com.jimmysun.androidheroes.R;

/**
 * Created by jimmy on 2016/12/13 0013
 */

public class BitmapShaderView extends View {
    private Paint mPaint;

    public BitmapShaderView(Context context) {
        super(context);
        initView();
    }

    public BitmapShaderView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initView();
    }

    public BitmapShaderView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView();
    }

    private void initView() {
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.test2);
//        BitmapShader bitmapShader = new BitmapShader(bitmap, Shader.TileMode.CLAMP, Shader
//                .TileMode.CLAMP);
        BitmapShader bitmapShader = new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader
                .TileMode.REPEAT);
        mPaint = new Paint();
        mPaint.setShader(bitmapShader);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawPaint(mPaint);
    }
}
