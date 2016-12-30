package com.jimmysun.androidheroes.chapter12;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.RemoteViews;

import com.jimmysun.androidheroes.MainActivity;
import com.jimmysun.androidheroes.R;

public class NotificationActivity extends AppCompatActivity {
    private static int NOTIFICATION_ID_BASIC = 1;
    private static int NOTIFICATION_ID_COLLAPSE = 2;
    private static int NOTIFICATION_ID_HEADSUP = 3;
    private static int NOTIFICATION_ID_VISIBILITY = 4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);
        Button basicButton = (Button) findViewById(R.id.btn_basic);
        basicButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Notification.Builder builder = new Notification.Builder(NotificationActivity.this);
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.baidu.com"));
                PendingIntent pendingIntent = PendingIntent.getActivity(NotificationActivity
                        .this, 0, intent, 0);
                builder.setSmallIcon(R.drawable.ic_launcher);
                builder.setContentIntent(pendingIntent);
                builder.setAutoCancel(true);
                builder.setLargeIcon(BitmapFactory.decodeResource(getResources(), R.drawable
                        .ic_launcher));
                builder.setContentTitle("基本的通知");
                builder.setContentText("基本通知的内容");
                builder.setSubText("基本通知的副内容");
                NotificationManager notificationManager = (NotificationManager) getSystemService
                        (NOTIFICATION_SERVICE);
                notificationManager.notify(NOTIFICATION_ID_BASIC, builder.build());
            }
        });
        Button collapsedButton = (Button) findViewById(R.id.btn_collapsed);
        collapsedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.sina.com"));
                PendingIntent pendingIntent = PendingIntent.getActivity(NotificationActivity
                        .this, 0, intent, 0);
                Notification.Builder builder = new Notification.Builder(NotificationActivity.this);
                builder.setSmallIcon(R.drawable.ic_launcher);
                builder.setContentIntent(pendingIntent);
                builder.setAutoCancel(true);
                builder.setLargeIcon(BitmapFactory.decodeResource(getResources(), R.drawable
                        .ic_launcher));

                RemoteViews collapsedView = new RemoteViews(getPackageName(), R.layout
                        .notification);
                collapsedView.setTextViewText(R.id.tv_collapsed, "折叠时Notification视图");
                Notification notification = builder.build();
                notification.contentView = collapsedView;

                notification.bigContentView = new RemoteViews(getPackageName(), R.layout
                        .notification_expanded);

                NotificationManager notificationManager = (NotificationManager) getSystemService
                        (NOTIFICATION_SERVICE);
                notificationManager.notify(NOTIFICATION_ID_COLLAPSE, notification);
            }
        });
        Button headsupButton = (Button) findViewById(R.id.btn_headsup);
        headsupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Notification.Builder builder = new Notification.Builder(NotificationActivity
                        .this).setSmallIcon(R.drawable.ic_launcher).setPriority(Notification
                        .PRIORITY_DEFAULT).setCategory(Notification.CATEGORY_MESSAGE)
                        .setContentTitle("悬挂式通知").setContentText("悬挂式通知的内容");
                Intent push = new Intent();
                push.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                push.setClass(NotificationActivity.this, MainActivity.class);
                PendingIntent pendingIntent = PendingIntent.getActivity(NotificationActivity
                        .this, 0, push, PendingIntent.FLAG_CANCEL_CURRENT);
                builder.setContentText("基于Android 5.0的悬挂式通知").setFullScreenIntent(pendingIntent,
                        true);
                NotificationManager notificationManager = (NotificationManager) getSystemService
                        (NOTIFICATION_SERVICE);
                notificationManager.notify(NOTIFICATION_ID_HEADSUP, builder.build());
            }
        });
        Button visibilityButton = (Button) findViewById(R.id.btn_visibility);
        visibilityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RadioGroup radioGroup = (RadioGroup) findViewById(R.id.rg_visibility);
                Notification.Builder builder = new Notification.Builder(NotificationActivity
                        .this).setContentTitle("分等级通知的测试");
                switch (radioGroup.getCheckedRadioButtonId()) {
                    case R.id.rb_public:
                        builder.setVisibility(Notification.VISIBILITY_PUBLIC);
                        builder.setContentText("Public");
                        builder.setSmallIcon(R.drawable.ic_public);
                        break;
                    case R.id.rb_private:
                        builder.setVisibility(Notification.VISIBILITY_PRIVATE);
                        builder.setContentText("Private");
                        builder.setSmallIcon(R.drawable.ic_private);
                        break;
                    case R.id.rb_secret:
                        builder.setVisibility(Notification.VISIBILITY_SECRET);
                        builder.setContentText("Secret");
                        builder.setSmallIcon(R.drawable.ic_secret);
                        builder.setColor(Color.RED);
                        break;
                }
                NotificationManager notificationManager = (NotificationManager) getSystemService
                        (NOTIFICATION_SERVICE);
                notificationManager.notify(NOTIFICATION_ID_VISIBILITY, builder.build());
            }
        });
    }
}
