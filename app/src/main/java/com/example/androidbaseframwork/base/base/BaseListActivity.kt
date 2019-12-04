package com.lp.baseandroid.base

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.androidbaseframwork.R
import com.example.uipractice.base.BaseListAdapter
import kotlinx.android.synthetic.main.activity_main.*

abstract class BaseListActivity<T> : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
    recyclerView.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
    recyclerView.adapter = object : BaseListAdapter<T>(getListData()) {
      override fun onItemClick(
        itemView: View,
        item: T?
      ) {
        this@BaseListActivity.onItemClick(itemView, item)
      }

      override fun bindData(
        itemView: View,
        item: T?
      ) {
        this@BaseListActivity.bindData(itemView, item)
      }

    }
  }

  abstract fun onItemClick(
    itemView: View,
    item: T?
  )

  abstract fun bindData(
    itemView: View,
    item: T?
  )

  abstract fun getListData(): ArrayList<T>?
}
