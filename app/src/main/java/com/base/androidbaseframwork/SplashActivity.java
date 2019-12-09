package com.base.androidbaseframwork;

import android.content.Intent;
import android.os.Handler;

import com.base.framwork.activity.BaseActivity;


/**
 * @date 2019-12-09
 * @Author luffy
 * @description
 */
public class SplashActivity extends BaseActivity {

    @Override
    protected void onResume() {
        super.onResume();

        new Handler().postDelayed(()-> startActivity(new Intent(this,MainActivity.class)),2000);
    }
}
