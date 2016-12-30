package com.jimmysun.androidheroes.chapter4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.jimmysun.androidheroes.R;

import java.util.List;

/**
 * Created by jimmy on 2016/12/8 0008
 */

public class ChatItemAdapter extends BaseAdapter {

    private List<ChatItemBean> mData;
    private LayoutInflater mInflater;

    public ChatItemAdapter(Context context, List<ChatItemBean> data) {
        mData = data;
        mInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public Object getItem(int position) {
        return mData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getItemViewType(int position) {
        ChatItemBean bean = mData.get(position);
        return bean.getType();
    }

    @Override
    public int getViewTypeCount() {
        return 2;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            if (getItemViewType(position) == 0) {
                holder = new ViewHolder();
                convertView = mInflater.inflate(R.layout.chat_item_in, null);
                holder.icon = (ImageView) convertView.findViewById(R.id.iv_in);
                holder.text = (TextView) convertView.findViewById(R.id.tv_in);
            } else {
                holder = new ViewHolder();
                convertView = mInflater.inflate(R.layout.chat_item_out, null);
                holder.icon = (ImageView) convertView.findViewById(R.id.iv_out);
                holder.text = (TextView) convertView.findViewById(R.id.tv_out);
            }
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        holder.icon.setImageBitmap(mData.get(position).getIcon());
        holder.text.setText(mData.get(position).getText());
        return convertView;
    }

    private final class ViewHolder {
        ImageView icon;
        TextView text;
    }
}
