package com.jimmysun.androidheroes.chapter6;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;

import com.jimmysun.androidheroes.R;

/**
 * Created by jimmy on 2016/12/13 0013
 */

public class CornerImageView extends View {
    private Bitmap mOut;

    public CornerImageView(Context context) {
        super(context);
        initView();
    }

    public CornerImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initView();
    }

    public CornerImageView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView();
    }

    public void initView() {
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.test2);
        mOut = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config
                .ARGB_8888);
        Canvas canvas = new Canvas(mOut);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            canvas.drawRoundRect(0, 0, bitmap.getWidth(), bitmap.getHeight(), 80, 80, paint);
        }
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, 0, 0, paint);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawBitmap(mOut, 0, 0, null);
    }
}
