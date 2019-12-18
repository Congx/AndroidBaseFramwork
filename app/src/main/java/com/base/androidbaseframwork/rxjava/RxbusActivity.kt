package com.base.androidbaseframwork.rxjava

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity

import android.os.Bundle
import android.view.accessibility.AccessibilityNodeProvider

import com.base.rxjavalib.RxBus
import com.example.androidbaseframwork.R
import com.uber.autodispose.AutoDispose
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider
import kotlinx.android.synthetic.main.activity_rxbus.*

class RxbusActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rxbus)

        btn_send.setOnClickListener {
            RxBus.getInstance().post(RxBusEvent.Event())
        }


        RxBus.getInstance()
                .toObservable(RxBusEvent.Event()::class.java)
                .subscribe({ textview.text = it.toString() },
                        {e -> e.printStackTrace()})
    }

    override fun onDestroy() {
        super.onDestroy()
        RxBus.getInstance().toObservable()
    }

}
