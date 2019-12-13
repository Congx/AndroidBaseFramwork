package com.base.framwork.p;

import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.AutoDisposeConverter;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;


/**
 * @date 2019-12-12
 * @Author luffy
 * @description
 */
public class BaseViewModle extends LifyCycleViewModel {

    @Override
    public void onCreate() {
        super.onCreate();
    }

    public <T> AutoDisposeConverter<T> bindLifecycle() {
        return AutoDispose.autoDisposable(AndroidLifecycleScopeProvider.from(this));
    }
}
