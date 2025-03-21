package com.example.a03_textview;

import android.graphics.Paint;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class TextViewActivity extends AppCompatActivity {

    private TextView m_tv4, m_tv5, m_tv6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_text_view);

        m_tv4 = (TextView)findViewById(R.id.tv_4);
        m_tv4.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);  // 中划线
        m_tv4.getPaint().setAntiAlias(true); // 去除锯齿

        m_tv5 = (TextView)findViewById(R.id.tv_5);
        m_tv5.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG); // 下划线

        m_tv6 = (TextView)findViewById(R.id.tv_6);
        m_tv6.setText(Html.fromHtml("<u>王富贵</u>"));

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}