package com.bawei.gyj.guoyanjun20170509.activitys;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.TextView;

import com.bawei.gyj.guoyanjun20170509.R;
import com.bawei.gyj.guoyanjun20170509.adapter.MyPageAdapter;
import com.bawei.gyj.guoyanjun20170509.fragments.Fragment1;
import com.bawei.gyj.guoyanjun20170509.fragments.Fragment2;

import java.util.ArrayList;

public class MainActivity extends FragmentActivity {

    private ViewPager viewPager;
    private TextView xw1;
    private TextView xw2;
    private ArrayList<TextView> tList;
    //111
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();

    }

    private void initData() {
        Fragment1 fragment1 = new Fragment1();
        Fragment2 fragment2 = new Fragment2();
        final ArrayList<Fragment> fList = new ArrayList<>();
        fList.add(fragment1);
        fList.add(fragment2);
        MyPageAdapter myPageAdapter = new MyPageAdapter(getSupportFragmentManager(), MainActivity.this, fList);
        viewPager.setAdapter(myPageAdapter);
        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                for (int i = 0; i < tList.size(); i++) {
                    if (position == i) {
                        tList.get(i).setSelected(true);
                    } else {
                        tList.get(i).setSelected(false);
                    }
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

    }

    private void initView() {
        viewPager = (ViewPager) findViewById(R.id.main_viewpage);
        xw1 = (TextView) findViewById(R.id.xw_1);
        xw2 = (TextView) findViewById(R.id.xw_2);
        tList = new ArrayList<>();
        tList.add(xw1);
        tList.add(xw2);
        tList.get(0).setSelected(true);
        xw1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(0);
            }
        });
        xw2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(1);
            }
        });
    }
}
