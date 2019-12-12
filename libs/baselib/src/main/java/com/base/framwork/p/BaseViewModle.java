package com.base.framwork.p;

import android.util.Log;

import androidx.lifecycle.LifecycleEventObserver;

/**
 * @date 2019-12-12
 * @Author luffy
 * @description
 */
public class BaseViewModle extends LifyCycleViewModel {

    @Override
    public void onCreate() {
        super.onCreate();

        getLifecycle().addObserver((LifecycleEventObserver) (source, event) -> {
            Log.e("BaseViewModle",event.toString());
        });
    }
}
