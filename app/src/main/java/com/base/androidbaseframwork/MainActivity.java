package com.base.androidbaseframwork;

import com.base.androidbaseframwork.rxjava.RxbusActivity;
import com.lp.baseandroid.base.BaseItemListActivity;
import com.lp.baseandroid.base.ItemBean;

import java.util.ArrayList;

public class MainActivity extends BaseItemListActivity {

    private ArrayList<ItemBean> list = new ArrayList<ItemBean>() {
        {
            add(new ItemBean("rxJava", RxbusActivity.class));
            add(new ItemBean("viewmodel", ViewModelActivity.class));
            add(new ItemBean("网络", ViewModelActivity.class));

        }
    };

    @Override
    public ArrayList<ItemBean> getListData() {
        return list;
    }
}
