package com.example.androidbaseframwork.rxjava

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity

import android.os.Bundle
import android.util.Log

import com.example.androidbaseframwork.R
import com.example.rxjavalib.RxBus
import kotlinx.android.synthetic.main.activity_rxbus.*
import kotlin.math.log

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
