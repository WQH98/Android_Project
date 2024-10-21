package com.example.a10_gridview.gridview;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.a10_gridview.R;

public class GridViewActivity extends AppCompatActivity {

    private GridView mgv;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gridview);
        mgv = findViewById(R.id.gv);
        mgv.setAdapter(new MyGridViewAdapter(GridViewActivity.this));
        mgv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(GridViewActivity.this, "点击pos" + i, Toast.LENGTH_SHORT).show();
            }
        });
        mgv.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(GridViewActivity.this, "长按pos" + i, Toast.LENGTH_SHORT).show();
                return true;
            }
        });
    }
}
