package com.itheima.tablayoutview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by admin on 2016/9/15.
 */
public class MyFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        RecyclerView recyclerView = new RecyclerView(getActivity());

        //设置布局管理器
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayout.VERTICAL,false));

        //设置适配器显示数据
        MyRecycleradapter adapter = new MyRecycleradapter();
        recyclerView.setAdapter(adapter);
        return recyclerView;
    }

    class MyRecycleradapter extends RecyclerView.Adapter{

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = View.inflate(parent.getContext(),android.R.layout.simple_list_item_1,null);
            return new MyViewHolder(view);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
            MyViewHolder myHolder = (MyViewHolder) holder;
            myHolder.text.setText("我是item"+position);
        }

        @Override
        public int getItemCount() {
            return 30;
        }

        class MyViewHolder extends RecyclerView.ViewHolder{

            public  TextView text;

            public MyViewHolder(View itemView) {
                super(itemView);
                text = (TextView) itemView.findViewById(android.R.id.text1);
            }
        }
    }
}
