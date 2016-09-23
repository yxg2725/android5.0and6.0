package com.itheima.toolbar_view;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.ViewAnimationUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //找出drawerLayout控件
        DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
        //找出toolbar控件
        Toolbar toobar = (Toolbar) findViewById(R.id.toobar);

        //设置显示的标题
        toobar.setTitle("我是ToolBar");
        toobar.setTitleTextColor(Color.WHITE);
        //显示actionBar
        setSupportActionBar(toobar);


        //设置左上角显示的图标
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //设置drawerlayout的监听事件
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawerLayout,0,0);
        toggle.syncState();//设置同步
       drawerLayout.setDrawerListener(toggle);

    }



}
