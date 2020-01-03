package com.base.androidbaseframwork.net

import com.base.framwork.activity.BaseViewActivity
import com.example.androidbaseframwork.R

class NetActivity : BaseViewActivity<NetViewModel>() {

    override fun generateIdLayout(): Int {
        return R.layout.activity_net
    }

    override fun initListener() {
    }


    override fun initData() {
    }


    override fun getViewModelClass(): Class<NetViewModel> {
        return NetViewModel::class.java
    }


}
