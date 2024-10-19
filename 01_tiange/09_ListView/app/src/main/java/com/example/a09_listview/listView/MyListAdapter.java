package com.example.a09_listview.listView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.a09_listview.R;
import com.bumptech.glide.Glide;

public class MyListAdapter extends BaseAdapter {

    private Context m_context;
    private LayoutInflater m_layout_inflater;

    public MyListAdapter(Context context) {
        this.m_context = context;
        this.m_layout_inflater = LayoutInflater.from(context);
    }

    @Override
    // 列表长度
    public int getCount() {
        return 10;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    static class ViewHolder {
        public ImageView image_view;
        public TextView tv_title, tv_time, tv_content;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder = null;
        if(view == null) {
            view = m_layout_inflater.inflate(R.layout.layout_list_item, null);
            holder = new ViewHolder();
            holder.image_view = view.findViewById(R.id.iv);
            holder.tv_title = view.findViewById(R.id.tv_title);
            holder.tv_time = view.findViewById(R.id.tv_time);
            holder.tv_content = view.findViewById(R.id.tv_content);
            view.setTag(holder);
        }
        else {
            holder = (ViewHolder) view.getTag();
        }
        // 给控件赋值
        holder.tv_title.setText("这是标题");
        holder.tv_time.setText("2088-08-08");
        holder.tv_content.setText("这是内容");
        Glide.with(m_context).load("https://img2.baidu.com/it/u=1544882228,2394903552&fm=253&app=138&size=w931&n=0&f=JPEG&fmt=auto?sec=1728666000&t=440b6dd3332e4100cf2db30e4c2b2ad4").into(holder.image_view);
        return view;
    }
}
