package com.base.androidbaseframwork.rxjava

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity

import android.os.Bundle

import com.base.rxjavalib.RxBus
import com.example.androidbaseframwork.R
import kotlinx.android.synthetic.main.activity_rxbus.*

class RxbusActivity : AppCompatActivity() {

    @SuppressLint("CheckResult")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rxbus)

        btn_send.setOnClickListener {
            RxBus.getInstance().post(RxBusEvent.Event())
        }


        RxBus.getInstance().toObservable(RxBusEvent.Event()::class.java)
                .subscribe({ textview.text = it.toString() },
                        {e -> e.printStackTrace()})
    }

    override fun onDestroy() {
        super.onDestroy()
        RxBus.getInstance().toObservable()
    }

}
