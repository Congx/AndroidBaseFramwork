package com.base.framwork.activity;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import com.base.framwork.p.LifyCycleViewModel;
import com.base.framwork.view.IBaseView;

/**
 * @date 2020-01-03
 * @Author luffy
 * @description
 */
public abstract class BaseViewDelegate<T> implements IBaseView {

    public static <R extends LifyCycleViewModel> BaseViewDelegate<R> create(BaseViewActivity activity) {
        return new BaseViewDelegateImpl<R>(activity);
    }

    public abstract T createViewModel(FragmentActivity activity, Class<T> tClass);

    public abstract T createViewModel(Fragment activity, Class<T> tClass);

    public abstract T getViewModel();
}
