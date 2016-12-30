package com.jimmysun.androidheroes.chapter11;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import com.jimmysun.androidheroes.R;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

import cn.bmob.push.PushConstants;

/**
 * Created by jimmy on 2016/12/24 0024
 */
public class PushReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals(PushConstants.ACTION_MESSAGE)) {
            String msg = intent.getStringExtra(PushConstants.EXTRA_PUSH_MESSAGE_STRING);
            Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
            JSONTokener jsonTokener = new JSONTokener(msg);
            String message = "";
            try {
                JSONObject object = (JSONObject) jsonTokener.nextValue();
                message = object.getString("alert");
            } catch (JSONException e) {
                e.printStackTrace();
            }
            NotificationManager manager = (NotificationManager) context.getSystemService(Context
                    .NOTIFICATION_SERVICE);
            Notification notification = new Notification.Builder(context).setContentTitle
                    ("Bmob推送").setContentText(message).setSmallIcon(R.drawable.ic_launcher).build();
            manager.notify(R.drawable.ic_launcher, notification);
        }
    }
}
