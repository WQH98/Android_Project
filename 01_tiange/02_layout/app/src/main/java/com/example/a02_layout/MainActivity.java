package com.example.a02_layout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.a02_layout.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    // Used to load the 'a02_layout' library on application startup.
    static {
        System.loadLibrary("a02_layout");
    }

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Example of a call to a native method
//        TextView tv = binding.sampleText;
//        tv.setText(stringFromJNI());
    }

    /**
     * A native method that is implemented by the 'a02_layout' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();
}