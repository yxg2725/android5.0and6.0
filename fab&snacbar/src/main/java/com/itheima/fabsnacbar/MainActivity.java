package com.itheima.fabsnacbar;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //找出悬浮按钮
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);   
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view,"我是Snackbar",Snackbar.LENGTH_SHORT)
                        .setAction("点我", new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Toast.makeText(MainActivity.this, "哈哈", Toast.LENGTH_SHORT).show();
                            }
                        }).show();
            }
        });
        
    }
}
