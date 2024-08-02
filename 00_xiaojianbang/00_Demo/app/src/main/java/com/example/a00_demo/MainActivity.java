package com.example.a00_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.a00_demo.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    // Used to load the 'a00_demo' library on application startup.
    static {
        Log.d("xiaojianbang", "MainActivity static");
        System.loadLibrary("a00_demo");
    }

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.d("xiaojianbang", "MainActivity static");

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Button button = binding.button;
        TextView tv = binding.textView;
        EditText et = binding.editTextText;
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("wangqinghao", "我是一个按钮 在别的地方被按下了");
                tv.setText("按下后");
                et.setText("我也是被按下后的");
            }
        });


        // Example of a call to a native method
//        TextView tv = binding.sampleText;
//        tv.setText(stringFromJNI());
    }

    /**
     * A native method that is implemented by the 'a00_demo' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();

    public void test(View view) {
        Log.d("wangqinghao", "我是一个按钮 被按下了");
    }
}