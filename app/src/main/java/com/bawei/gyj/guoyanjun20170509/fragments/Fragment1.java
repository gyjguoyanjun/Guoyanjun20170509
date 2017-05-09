package com.bawei.gyj.guoyanjun20170509.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.bawei.gyj.guoyanjun20170509.R;
import com.bawei.gyj.guoyanjun20170509.activitys.XqActivity;
import com.bawei.gyj.guoyanjun20170509.adapter.MyBaseAdapter;

import java.util.ArrayList;

/**
 * data:2017/5/9
 * author:郭彦君(Administrator)
 * function:
 */
public class Fragment1 extends Fragment {

    private View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.frag_1, null);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initView();
        initData();
    }

    private void initData() {
    }

    private void initView() {
        ListView listView = (ListView) view.findViewById(R.id.f1_list);
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add("新闻标题" + i);
        }
        MyBaseAdapter adapter = new MyBaseAdapter(getActivity(), list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getActivity(), XqActivity.class);
                startActivity(intent);
            }
        });
    }
}
