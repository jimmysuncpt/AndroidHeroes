package com.jimmysun.androidheroes.chapter6;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by jimmy on 2016/12/11 0011
 */

public class LayerCoverageView extends View {
    public LayerCoverageView(Context context) {
        super(context);
    }

    public LayerCoverageView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public LayerCoverageView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawColor(Color.WHITE);
        Paint paint = new Paint();
        paint.setColor(Color.BLUE);
        canvas.drawCircle(150, 150, 100, paint);

        canvas.saveLayerAlpha(0, 0, 400, 400, 127, Canvas.MATRIX_SAVE_FLAG |
                Canvas.CLIP_SAVE_FLAG |
                Canvas.HAS_ALPHA_LAYER_SAVE_FLAG |
                Canvas.FULL_COLOR_LAYER_SAVE_FLAG |
                Canvas.CLIP_TO_LAYER_SAVE_FLAG);
        paint.setColor(Color.RED);
        canvas.drawCircle(200, 200, 100, paint);
        canvas.restore();
    }
}
