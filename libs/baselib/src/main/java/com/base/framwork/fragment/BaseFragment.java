package com.base.framwork.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.base.framwork.view.ILifeProcessor;

/**
 * @date 2019-12-09
 * @Author luffy
 * @description
 */
public abstract class BaseFragment extends Fragment implements ILifeProcessor {

    private View rootView;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initParams(null);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (generateIdLayout() > 0) {
            rootView = inflater.inflate(generateIdLayout(),container,false);
        } else if (generateViewLayout() != null) {
            rootView = generateViewLayout();
        }
        setStatusBar();
        initView();
        initData();
        initListener();
        return rootView;
    }

    public <T extends View> T findViewById(@IdRes int id) {
        return rootView.findViewById(id);
    }

}
