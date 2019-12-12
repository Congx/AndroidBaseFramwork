package com.base.androidbaseframwork;

import androidx.annotation.NonNull;
import androidx.lifecycle.MutableLiveData;

import com.base.framwork.activity.BaseActivity;
import com.example.androidbaseframwork.R;

public class ViewModelActivity extends BaseActivity<MyViewModel> {

    @NonNull
    @Override
    public Class<MyViewModel> getViewModelClass() {
        return MyViewModel.class;
    }

    @Override
    public int getContentLayoutId() {
        return R.layout.activity_view_model;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {
        MutableLiveData<String> liveData = new MutableLiveData<>();
        liveData.observe(this,str-> {

        });

    }


}
