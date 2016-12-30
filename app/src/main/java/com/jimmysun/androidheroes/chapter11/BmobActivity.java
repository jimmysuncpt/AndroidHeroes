package com.jimmysun.androidheroes.chapter11;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.jimmysun.androidheroes.R;

import java.util.List;

import cn.bmob.push.BmobPush;
import cn.bmob.v3.Bmob;
import cn.bmob.v3.BmobInstallation;
import cn.bmob.v3.BmobPushManager;
import cn.bmob.v3.BmobQuery;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.FindListener;
import cn.bmob.v3.listener.SaveListener;

public class BmobActivity extends AppCompatActivity {
    private EditText mNameEditText, mFeedbackEditText, mQueryNameEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmob);
        mNameEditText = (EditText) findViewById(R.id.et_name);
        mFeedbackEditText = (EditText) findViewById(R.id.et_feedback);
        mQueryNameEditText = (EditText) findViewById(R.id.et_query_name);
        Bmob.initialize(this, "643469b7bf17cc54c08c9b573e81c747");
        Button saveButton = (Button) findViewById(R.id.btn_save);
        if (saveButton != null) {
            saveButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Feedback feedback = new Feedback();
                    feedback.setName(mNameEditText.getText().toString());
                    feedback.setFeedback(mFeedbackEditText.getText().toString());
                    feedback.save(new SaveListener<String>() {
                        @Override
                        public void done(String s, BmobException e) {
                            Toast.makeText(BmobActivity.this, s, Toast.LENGTH_SHORT).show();
                        }
                    });
                }
            });
        }
        Button queryButton = (Button) findViewById(R.id.btn_query);
        if (queryButton != null) {
            queryButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    BmobQuery<Feedback> query = new BmobQuery<>();
                    // 设置查询条件
                    if (mQueryNameEditText.getText().toString().length() != 0) {
                        query.addWhereEqualTo("name", mQueryNameEditText.getText().toString());
                    }
                    query.findObjects(new FindListener<Feedback>() {
                        @Override
                        public void done(List<Feedback> list, BmobException e) {
                            AlertDialog.Builder builder = new AlertDialog.Builder(BmobActivity
                                    .this);
                            builder.setTitle("查询结果");
                            String string = "";
                            for (Feedback feedback : list) {
                                string += feedback.getName() + ":" + feedback.getFeedback() + "\n";
                            }
                            builder.setMessage(string);
                            builder.create().show();
                        }
                    });
                }
            });
        }
        BmobInstallation.getCurrentInstallation().save();
        BmobPush.startWork(this);
        Button pushButton = (Button) findViewById(R.id.btn_push);
        if (pushButton != null) {
            pushButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    BmobPushManager push = new BmobPushManager();
                    push.pushMessageAll("推送测试");
                }
            });
        }
    }
}
