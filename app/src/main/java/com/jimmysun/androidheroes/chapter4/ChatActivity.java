package com.jimmysun.androidheroes.chapter4;

import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.jimmysun.androidheroes.R;

import java.util.ArrayList;
import java.util.List;

public class ChatActivity extends AppCompatActivity {

    private ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        mListView = (ListView) findViewById(R.id.lv_chat);
        ChatItemBean bean1 = new ChatItemBean();
        bean1.setType(0);
        bean1.setIcon(BitmapFactory.decodeResource(getResources(), R.drawable.in_icon));
        bean1.setText("Hello, how are you?");

        ChatItemBean bean2 = new ChatItemBean();
        bean2.setType(1);
        bean2.setIcon(BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher));
        bean2.setText("Fine thank you, and you? And bala bala bala...");

        ChatItemBean bean3 = new ChatItemBean();
        bean3.setType(0);
        bean3.setIcon(BitmapFactory.decodeResource(getResources(), R.drawable.in_icon));
        bean3.setText("I'm fine too.");

        ChatItemBean bean4 = new ChatItemBean();
        bean4.setType(1);
        bean4.setIcon(BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher));
        bean4.setText("拜拜！");

        ChatItemBean bean5 = new ChatItemBean();
        bean5.setType(0);
        bean5.setIcon(BitmapFactory.decodeResource(getResources(), R.drawable.in_icon));
        bean5.setText("再见。");
        List<ChatItemBean> data = new ArrayList<>();
        data.add(bean1);
        data.add(bean2);
        data.add(bean3);
        data.add(bean5);
        data.add(bean4);
        mListView.setAdapter(new ChatItemAdapter(this, data));
    }
}
