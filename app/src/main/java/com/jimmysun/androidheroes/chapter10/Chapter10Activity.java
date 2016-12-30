package com.jimmysun.androidheroes.chapter10;

import android.content.Intent;
import android.os.Bundle;
import android.os.Debug;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.jimmysun.androidheroes.R;

public class Chapter10Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter10);
        Debug.startMethodTracing();
        Button includeButton = (Button) findViewById(R.id.btn_include);
        if (includeButton != null) {
            includeButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Chapter10Activity.this, IncludeActivity.class);
                    startActivity(intent);
                }
            });
        }
        Button viewStubButton = (Button) findViewById(R.id.btn_view_stub);
        if (viewStubButton != null) {
            viewStubButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Chapter10Activity.this, ViewStubActivity.class);
                    startActivity(intent);
                }
            });
        }
        Button hierarchyViewerButton = (Button) findViewById(R.id.btn_hierarchy_viewer);
        if (hierarchyViewerButton != null) {
            hierarchyViewerButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Chapter10Activity.this, HierarchyViewerActivity
                            .class);
                    startActivity(intent);
                }
            });
        }
    }

    @Override
    protected void onDestroy() {
        Debug.stopMethodTracing();
        super.onDestroy();
    }
}
