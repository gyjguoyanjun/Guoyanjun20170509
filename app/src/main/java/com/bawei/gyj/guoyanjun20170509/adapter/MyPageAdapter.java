package com.bawei.gyj.guoyanjun20170509.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * data:2017/5/9
 * author:郭彦君(Administrator)
 * function:
 */
public class MyPageAdapter extends FragmentPagerAdapter {
    private Context context;
    private ArrayList<Fragment> list;

    public MyPageAdapter(FragmentManager fm, Context context, ArrayList<Fragment> list) {
        super(fm);
        this.context = context;
        this.list = list;
    }

    public MyPageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return list.get(position);
    }

    @Override
    public int getCount() {
        return list.size();
    }
}
