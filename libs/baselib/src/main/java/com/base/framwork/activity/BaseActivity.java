package com.base.framwork.activity;

import android.os.Bundle;

import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;

import com.base.framwork.p.LifyCycleViewModel;

/**
 * @date 2019-12-08
 * @Author luffy
 * @description
 */
public abstract class BaseActivity<T extends LifyCycleViewModel> extends AppCompatActivity {

    protected  T viewModle;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initParams(savedInstanceState);
        setContentView(getContentLayoutId());
        createViewModel();
        initView();
        initData();
    }

    /**
     * 主要是用于初始化intent参数值、savedInstanceState的值
     * @param savedInstanceState
     */
    public void initParams(Bundle savedInstanceState) { }

    protected abstract void initView();

    protected abstract void initData();

    @LayoutRes
    public abstract int getContentLayoutId();

    @NonNull
    public abstract Class<T> getViewModelClass();

    protected T createViewModel() {
        viewModle = ViewModelProviders.of(this).get(getViewModelClass());
        getLifecycle().addObserver(viewModle);
        return viewModle;
    }

    public T getViewModel() {
        return viewModle;
    }

}
