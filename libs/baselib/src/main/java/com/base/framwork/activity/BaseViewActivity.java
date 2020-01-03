package com.base.framwork.activity;

import android.content.Intent;
import android.view.View;

import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;

import com.base.framwork.p.LifyCycleViewModel;
import com.base.framwork.view.IBaseView;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * @date 2019-12-08
 * @Author luffy
 * @description 分装与P层交互的一些逻辑和通用的UI的部分实现
 */
public abstract class BaseViewActivity<T extends LifyCycleViewModel> extends BaseActivity implements IBaseView {

    // 具体实现的代理类,这样设计便于扩展
    private BaseViewDelegate<T> mDelegate;

    @Override
    @CallSuper
    public void initView() {
        createViewModel();
    }

    /**
     * 这个方法，不用强制实现，并不是每个都需要用intent值
     * 默认空实现
     * @param intent
     */
    @Override
    public void initParams(@NotNull Intent intent) {

    }

    /**
     * 默认以layoutResId形式来填充，用{@link BaseActivity#generateIdLayout()}，如果需要重新这个方法
     *
     * 默认空实现
     * @return
     */
    @NotNull
    @Override
    public View generateViewLayout() {
        return null;
    }

    @NonNull
    public abstract Class<T> getViewModelClass();

    /**
     * 默认实现无参数的构造实例化
     * @return
     */
    public T createViewModel() {
        return getViewDelegate().createViewModel(this,getViewModelClass());
    }

    public T getViewModel() {
       return getViewDelegate().getViewModel();
    }

    /**
     * 获取和实例化代理类
     * @return
     */
    @NonNull
    public BaseViewDelegate<T> getViewDelegate() {
        if(mDelegate == null) {
            mDelegate =  BaseViewDelegate.create(this);
        }
        return mDelegate;
    }

    public void setDelegate(BaseViewDelegateImpl<T> delegate) {
        this.mDelegate = delegate;
    }

    @Override
    public void showDialog(@NotNull String message) {
        getViewDelegate().showDialog(message);
    }

    @Override
    public void showDialog(@NotNull String message, int type) {
        getViewDelegate().showDialog(message,type);
    }

    @Override
    public void showToast(@NotNull String message) {
        getViewDelegate().showToast(message);
    }

    @Override
    public void showLoading() {
        getViewDelegate().showLoading();
    }

    @Override
    public void showLoading(@Nullable String message) {
        getViewDelegate().showLoading(message);
    }

    @Override
    public void hideLoading() {
        getViewDelegate().hideLoading();
    }

    @Override
    public void showNormal() {
        getViewDelegate().showNormal();
    }

    @Override
    public void showEmpty() {
        getViewDelegate().showEmpty();
    }

    @Override
    public void showError() {
        getViewDelegate().showError();
    }

    @Override
    public void showError(@NotNull String message) {
        getViewDelegate().showError(message);
    }

    @Override
    public void showError(@NotNull String message, int type) {
        getViewDelegate().showError(message,type);
    }

    @Override
    public void gotoLoginActivity() {
        getViewDelegate().gotoLoginActivity();
    }
}
