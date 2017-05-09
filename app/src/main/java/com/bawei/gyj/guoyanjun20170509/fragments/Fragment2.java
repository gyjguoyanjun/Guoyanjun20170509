package com.bawei.gyj.guoyanjun20170509.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bawei.gyj.guoyanjun20170509.R;
import com.bawei.gyj.guoyanjun20170509.adapter.MyRecyclerViewAdapter;

import java.util.ArrayList;

/**
 * data:2017/5/9
 * author:郭彦君(Administrator)
 * function:
 */
public class Fragment2 extends Fragment {

    private View view;
    /**
     * 复用视图的控件
     */
    private RecyclerView recyclerView;

    /**
     * 显示的数据
     */
    private ArrayList<String> mDatas;

    /**
     * RecyclerView的适配器
     */
    private MyRecyclerViewAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.f2_layout, null);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initView();
        initData();
    }

    private void initData() {
        mDatas = new ArrayList<String>();
        for (int i = 'A'; i < 'z'; i++){
            mDatas.add("" + (char) i);
        }
    }

    private void initView() {
        //1.找到控件
        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerview);
        //2.声名为瀑布流的布局方式: 3列,垂直方向
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL);
        //3.为recyclerView设置布局管理器
        recyclerView.setLayoutManager(staggeredGridLayoutManager);
        initData();//初始化数据
        //3.创建适配器
        adapter = new MyRecyclerViewAdapter(getActivity(), mDatas);
        //设置添加,移除item的动画,DefaultItemAnimator为默认的
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        //4.设置适配器
        recyclerView.setAdapter(adapter);


    }
}
