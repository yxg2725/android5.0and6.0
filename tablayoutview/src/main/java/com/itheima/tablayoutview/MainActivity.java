package com.itheima.tablayoutview;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TableLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //1.显示ToolBar
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //2.显示tab
        TabLayout tab = (TabLayout) findViewById(R.id.tab);

        //给tab添加标题
        tab.addTab(tab.newTab().setText("tab1"));
        tab.addTab(tab.newTab().setText("tab2"));
        tab.addTab(tab.newTab().setText("tab3"));

        //3.显示viewpager
        ViewPager viewpager = (ViewPager) findViewById(R.id.viewpager);
        MyAdapter adapter = new MyAdapter(getSupportFragmentManager());
        viewpager.setAdapter(adapter);

        //4.让tab和viewPager关联起来
        tab.setupWithViewPager(viewpager);
    }

    class MyAdapter extends FragmentPagerAdapter{

        public MyAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return new MyFragment();
        }

        @Override
        public int getCount() {
            return 3;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return "tab" + position;
        }
    }
}
