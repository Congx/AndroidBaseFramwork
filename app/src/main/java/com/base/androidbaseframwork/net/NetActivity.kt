package com.base.androidbaseframwork.net

import com.base.framwork.activity.BaseActivity
import com.example.androidbaseframwork.R

class NetActivity : BaseActivity<NetViewModel>() {

    override fun initView() {
    }

    override fun initData() {
    }

    override fun getContentLayoutId(): Int {
        return R.layout.activity_net
    }

    override fun getViewModelClass(): Class<NetViewModel> {
        return NetViewModel::class.java
    }


}
