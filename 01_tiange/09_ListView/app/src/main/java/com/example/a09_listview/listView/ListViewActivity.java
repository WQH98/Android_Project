package com.example.a09_listview.listView;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.Nullable;

import com.example.a09_listview.R;

public class ListViewActivity extends Activity {
    private ListView m_lv1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);
        m_lv1 = findViewById(R.id.lv_1);
        m_lv1.setAdapter(new MyListAdapter(ListViewActivity.this));
        m_lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(ListViewActivity.this, "点击 pos: " + i, Toast.LENGTH_SHORT).show();
            }
        });

        m_lv1.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(ListViewActivity.this, "长按 pos: " + i, Toast.LENGTH_SHORT).show();
                return true;
            }
        });
    }
}
