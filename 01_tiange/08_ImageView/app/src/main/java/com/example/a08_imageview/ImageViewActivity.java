package com.example.a08_imageview;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.bumptech.glide.Glide;

public class ImageViewActivity extends AppCompatActivity {

    private ImageView m_iv4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_image_view);

        m_iv4 = findViewById(R.id.iv_4);
        Glide.with(this).load("https://img2.baidu.com/it/u=1544882228,2394903552&fm=253&app=138&size=w931&n=0&f=JPEG&fmt=auto?sec=1728666000&t=440b6dd3332e4100cf2db30e4c2b2ad4").into(m_iv4);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}