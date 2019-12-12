package com.base.androidbaseframwork;

import android.content.Intent;
import android.os.Handler;

import androidx.annotation.NonNull;

import com.base.framwork.activity.BaseActivity;
import com.base.framwork.p.LifyCycleViewModel;
import com.example.androidbaseframwork.R;


/**
 * @date 2019-12-09
 * @Author luffy
 * @description
 */
public class SplashActivity extends BaseActivity {

    @Override
    protected void onResume() {
        super.onResume();

        new Handler().postDelayed(()-> {
            startActivity(new Intent(this,MainActivity.class));
            finish();
        },2000);
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {

    }

    @Override
    public int getContentLayoutId() {
        return R.layout.activity_splash;
    }

    @NonNull
    @Override
    public Class getViewModelClass() {
        return LifyCycleViewModel.class;
    }
}
