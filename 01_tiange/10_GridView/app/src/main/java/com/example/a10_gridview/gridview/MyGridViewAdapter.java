package com.example.a10_gridview.gridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.a10_gridview.R;

public class MyGridViewAdapter extends BaseAdapter {

    @Override
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

    private Context m_context;
    private LayoutInflater m_layoutInflater;
    public MyGridViewAdapter(Context context) {
        this.m_context = context;
        this.m_layoutInflater = LayoutInflater.from(context);
    }

    static class ViewHolder {
        public ImageView imageView;
        public TextView textView;

    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder = null;
        if(view == null) {
            view = m_layoutInflater.inflate(R.layout.layout_grid_item, null);
            holder = new ViewHolder();
            holder.imageView = view.findViewById(R.id.iv_grid);
            holder.textView = view.findViewById(R.id.tv_title);
            view.setTag(holder);
        }
        else {
            holder = (ViewHolder) view.getTag();
        }
        // 赋值
        holder.textView.setText("花");
        Glide.with(m_context).load("https://img2.baidu.com/it/u=1544882228,2394903552&fm=253&app=138&size=w931&n=0&f=JPEG&fmt=auto?sec=1728666000&t=440b6dd3332e4100cf2db30e4c2b2ad4").into(holder.imageView);
        return view;
    }
}
