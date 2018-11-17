package com.hisense.myapplication;

import android.app.Application;

import com.hisense.maplibrary.util.MapUtil;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        MapUtil.initBaiduMap(this);
    }
}
