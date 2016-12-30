package com.jimmysun.androidheroes.chapter4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.jimmysun.androidheroes.R;

public class Chapter4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter4);
        Button listViewButton = (Button) findViewById(R.id.btn_list_view);
        if (listViewButton != null) {
            listViewButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Chapter4Activity.this, ListViewActivity.class);
                    startActivity(intent);
                }
            });
        }
        Button chatButton = (Button) findViewById(R.id.btn_chat);
        if (chatButton != null) {
            chatButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Chapter4Activity.this, ChatActivity.class);
                    startActivity(intent);
                }
            });
        }
    }
}
