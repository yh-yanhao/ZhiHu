package com.zh.zhihuxiangmu.view.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.zh.zhihuxiangmu.R;
import com.zh.zhihuxiangmu.bean.MyBean;

import java.util.List;

/**
 * 1、类名
 * 2、严浩
 * 3、2016.11.
 */
public class MyRibaoAdapter extends RecyclerView.Adapter<MyRibaoAdapter.MyViewHolder>{

    Context context;
    List<MyBean.StoriesBean> list;

    public MyRibaoAdapter(Context context, List<MyBean.StoriesBean> list) {

        this.context=context;
        this.list=list;
    }

    @Override
    public MyRibaoAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = View.inflate(context, R.layout.recy_item, null);
        MyViewHolder holder = new MyViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(MyRibaoAdapter.MyViewHolder holder, int position) {
        //加载图片
        Glide.with(context).load(list.get(position).getImages().get(0)).into(holder.img_ribao);
        holder.tv_ribao.setText(list.get(position).getTitle());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView img_ribao;
        TextView tv_ribao;

        public MyViewHolder(View itemView) {
            super(itemView);
            img_ribao = (ImageView) itemView.findViewById(R.id.img_ribao);
            tv_ribao = (TextView) itemView.findViewById(R.id.tv_ribao);
        }
    }
}
