package com.itheima.a5060;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyler_view);

        //1.设置布局管理器
      //  recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));

        //2.显示数据
        MyAdapter adapter = new MyAdapter();
        recyclerView.setAdapter(adapter);

    }


    class MyAdapter extends RecyclerView.Adapter {

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

            View view = View.inflate(MainActivity.this, R.layout.item, null);
            return new MyViewHolder(view);
        }

        //显示数据
        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
            MyViewHolder viewHolder = (MyViewHolder) holder;
            viewHolder.iv.setImageResource(Constant.icons[position]);//显示图片要用第三方开源框架来显示这里没有使用
        }

        @Override
        public int getItemCount() {
            return Constant.icons.length;
        }

        class MyViewHolder extends RecyclerView.ViewHolder {

            public ImageView iv;

            public MyViewHolder(View itemView) {
                super(itemView);

                iv = (ImageView) itemView.findViewById(R.id.iv);

            }
        }

    }
}
