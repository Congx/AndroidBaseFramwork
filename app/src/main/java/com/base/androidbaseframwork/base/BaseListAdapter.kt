package com.base.uipractice.base

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.androidbaseframwork.R


import java.util.ArrayList

open abstract class BaseListAdapter<T> : RecyclerView.Adapter<MyHolder<T>> {

    private var list: ArrayList<T>?

    constructor(list: ArrayList<T>?) {
        this.list = list
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder<T> {
        val inflate =
            LayoutInflater.from(parent.context).inflate(getItemRes(), parent, false)
        return MyHolder(inflate)
    }

    open fun getItemRes():Int {
        return R.layout.item_base_list
    }


    override fun onBindViewHolder(holder: MyHolder<T>, position: Int) {
        bindData(holder.itemView, list?.get(position))
        holder.itemView.setOnClickListener { v->
            onItemClick(v,list?.get(position))
        }
    }

    override fun getItemCount(): Int {
        return list?.size ?: 0
    }



    abstract fun bindData(itemView: View,item:T?)
    abstract fun onItemClick(itemView: View,item:T?)
}


class MyHolder<T>(itemView: View) : RecyclerView.ViewHolder(itemView) {

}