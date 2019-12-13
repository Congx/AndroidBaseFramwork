package com.base.androidbaseframwork;

import android.util.Log;

import androidx.lifecycle.LifecycleEventObserver;

import com.base.framwork.p.BaseViewModle;
import java.util.concurrent.TimeUnit;
import io.reactivex.Observable;

/**
 * @date 2019-12-11
 * @Author luffy
 * @description
 */
public class MyViewModel extends BaseViewModle {

    @Override
    public void onCreate() {
        super.onCreate();
        // viewmodel作为生命周期分发器 测试
//        getVersionLifecycle().addObserver((LifecycleEventObserver) (source, event) -> {
//            Log.e("MyViewModel",event.toString());
//        });

        // autodispose 测试
        Observable.interval(1, TimeUnit.SECONDS)
                .doOnDispose(()->{
                    Log.e("MyViewModel","dispose");
                })
                .as(bindLifecycle())
                .subscribe(t-> {
                    Log.e("MyViewModel",t.toString());
                },e->{
                    e.printStackTrace();
                });

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}
