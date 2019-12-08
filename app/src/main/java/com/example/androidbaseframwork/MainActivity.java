package com.example.androidbaseframwork;

import com.example.androidbaseframwork.rxjava.RxbusActivity;
import com.lp.baseandroid.base.BaseItemListActivity;
import com.lp.baseandroid.base.ItemBean;

import java.util.ArrayList;

public class MainActivity extends BaseItemListActivity {

    private ArrayList<ItemBean> list = new ArrayList<ItemBean>() {
        {
            add(new ItemBean("rxJava", RxbusActivity.class));

        }
    };

    @Override
    public ArrayList<ItemBean> getListData() {
        return list;
    }
}
