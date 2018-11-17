package com.hisense.maplibrary.util;

import android.content.Context;

import com.baidu.mapapi.SDKInitializer;


public class MapUtil {
    public static void initBaiduMap(Context context){
        SDKInitializer.initialize(context);
    }
}
