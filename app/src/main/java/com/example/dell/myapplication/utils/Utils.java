package com.example.dell.myapplication.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/**
 * @version ${Rev}
 * @auther liucz
 * @time 2016/11/17 15:32
 */

public class Utils {
    /* */

    /**
     * 获取本地版本号
     *
     * @return
     */
    public static int getLocationVersionCode(Context context) {
        try { //得到包管理器 PackageManager
            PackageManager manager = context.getPackageManager();
//            packageName, 包名 flags 标志默认标志为0
            PackageInfo packageInfo = manager.getPackageInfo(context.getPackageName(), 0);
            return packageInfo.versionCode; // return "版本:"+packageInfo.versionName;
        } catch (Exception e) { // TODO Auto-generated catch block
            e.printStackTrace();
            return -1;
        }


    }

}
