package com.jimmysun.androidheroes.chapter6;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by jimmy on 2016/12/11 0011
 */

public class ClockView extends View {

    public ClockView(Context context) {
        super(context);
    }

    public ClockView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ClockView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getMeasuredWidth();
        int height = getMeasuredHeight();

        // 画外圆
        Paint paintCircle = new Paint();
        paintCircle.setStyle(Paint.Style.STROKE);
        paintCircle.setAntiAlias(true);
        paintCircle.setStrokeWidth(5);
        canvas.drawCircle(width / 2, height / 2, width / 2, paintCircle);

        // 画刻度
        Paint paintDegree = new Paint();
        for (int i = 0; i < 12; i++) {
            // 区分整点和与非整点
            if (i % 3 == 0) {
                paintDegree.setStrokeWidth(5);
                paintDegree.setTextSize(30);
                canvas.drawLine(width / 2, height / 2 - width / 2, width / 2, height / 2 -
                        width / 2 + 60, paintDegree);
                String degree = String.valueOf(i);
                canvas.drawText(degree, width / 2 - paintDegree.measureText(degree) / 2, height
                        / 2 - width / 2 + 90, paintDegree);
            } else {
                paintDegree.setStrokeWidth(3);
                paintDegree.setTextSize(15);
                canvas.drawLine(width / 2, height / 2 - width / 2, width / 2, height / 2 -
                        width / 2 + 30, paintDegree);
                String degree = String.valueOf(i);
                canvas.drawText(degree, width / 2 - paintDegree.measureText(degree) / 2, height
                        / 2 - width / 2 + 60, paintDegree);
            }
            // 通过旋转画布简化坐标运算
            canvas.rotate(30, width / 2, height / 2);
        }

        // 画指针
        Paint paintHour = new Paint();
        paintHour.setStrokeWidth(20);
        Paint paintMinute = new Paint();
        paintMinute.setStrokeWidth(10);
        canvas.save();
        canvas.translate(width / 2, height / 2);
        canvas.drawLine(0, 0, 100, 100, paintHour);
        canvas.drawLine(0, 0, 100, 200, paintMinute);
        canvas.restore();
    }
}
