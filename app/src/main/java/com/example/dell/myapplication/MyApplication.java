package com.example.dell.myapplication;

import android.app.Application;
import android.content.Context;
import android.os.Handler;

/**
 * @version ${Rev}
 * @auther liucz
 * @time 2016/11/17 15:36
 */

public class MyApplication extends Application {
    public static Handler mainHandler;
    public static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
        mainHandler = new Handler();

        //初始化ImageLoader
        //        ImageLoader.getInstance().init(ImageLoaderConfiguration.createDefault(this));
    }
}
