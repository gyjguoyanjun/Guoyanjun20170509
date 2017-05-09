package com.bawei.gyj.guoyanjun20170509.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.bawei.gyj.guoyanjun20170509.R;

import java.util.ArrayList;

/**
 * data:2017/5/9
 * author:郭彦君(Administrator)
 * function:
 */
public class MyBaseAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<String> list;

    public MyBaseAdapter(Context context, ArrayList<String> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = View.inflate(context, R.layout.f1_list_layout, null);
            holder = new ViewHolder();
            holder.textView = (TextView) convertView.findViewById(R.id.list_text);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        holder.textView.setText(list.get(position));
        return convertView;
    }

    class ViewHolder {
        TextView textView;
    }
}
