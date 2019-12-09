package com.base.androidbaseframwork;

import android.app.Application;

import com.base.framwork.BuildConfig;
import com.base.framwork.app.CrashHandler;

/**
 * @date 2019-12-04
 * @Author luffy
 * @description
 */
public class MyApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        // 自定义crash处理
        CrashHandler.getInstance().init(this, BuildConfig.DEBUG,true,0,SplashActivity.class);
    }
}
