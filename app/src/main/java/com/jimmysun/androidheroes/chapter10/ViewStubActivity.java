package com.jimmysun.androidheroes.chapter10;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.TextView;

import com.jimmysun.androidheroes.R;

public class ViewStubActivity extends AppCompatActivity {
    private ViewStub mViewStub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_stub);
        mViewStub = (ViewStub) findViewById(R.id.vs_not_often_use);
        Button visibleButton = (Button) findViewById(R.id.btn_visible);
        if (visibleButton != null) {
            visibleButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mViewStub.setVisibility(View.VISIBLE);
                }
            });
        }
        Button inflateButton = (Button) findViewById(R.id.btn_inflate);
        if (inflateButton != null) {
            inflateButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    View inflateView = mViewStub.inflate();
                    TextView textView = (TextView) inflateView.findViewById(R.id.tv_not_often_use);
                    textView.setText("哈哈！");
                }
            });
        }
    }
}
