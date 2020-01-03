package com.base.framwork.activity

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.ViewModelProviders
import com.base.framwork.p.LifyCycleViewModel

/**
 * @date 2020-01-03
 * @Author luffy
 * @description
 */
open class BaseViewDelegateImpl<T : LifyCycleViewModel>(var activity: BaseViewActivity<T>) : BaseViewDelegate<T>() {

    protected lateinit var viewModle: T

    override fun showDialog(message: String) {

    }

    override fun showDialog(message: String, type: Int) {

    }

    override fun showLoading() {

    }

    override fun showLoading(message: String?) {

    }

    override fun hideLoading() {

    }

    override fun showNormal() {

    }

    override fun showEmpty() {

    }

    override fun showError() {

    }

    override fun showError(message: String) {

    }

    override fun showError(message: String, type: Int) {

    }

    override fun showToast(message: String) {

    }

    override fun gotoLoginActivity() {

    }

    override fun createViewModel(activity: FragmentActivity, tClass: Class<T>): T {
        viewModle = ViewModelProviders.of(activity).get(tClass)
        activity.lifecycle.addObserver(viewModle)
        return viewModle
    }

    override fun createViewModel(fragment: Fragment, tClass: Class<T>): T {
        viewModle = ViewModelProviders.of(fragment).get(tClass)
        fragment.lifecycle.addObserver(viewModle)
        return viewModle
    }

    override fun getViewModel(): T {
        return viewModle
    }

}