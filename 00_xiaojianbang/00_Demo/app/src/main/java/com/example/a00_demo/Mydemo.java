package com.example.a00_demo;

import android.app.Application;
import android.content.Context;
import android.util.Log;

public class Mydemo extends Application {

    static {
        Log.d("xiaojianbang", "Mydemo static");
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        Log.d("xiaojianbang", "Mydemo attachBaseContext");
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d("xiaojianbang", "Mydemo onCreate");
    }
}
