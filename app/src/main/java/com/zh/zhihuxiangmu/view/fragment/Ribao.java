package com.zh.zhihuxiangmu.view.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bigkoo.convenientbanner.ConvenientBanner;
import com.bigkoo.convenientbanner.holder.CBViewHolderCreator;
import com.bigkoo.convenientbanner.holder.Holder;
import com.google.gson.Gson;
import com.zh.zhihuxiangmu.R;
import com.zh.zhihuxiangmu.bean.MyBean;
import com.zh.zhihuxiangmu.view.adapter.MyRibaoAdapter;

import java.io.IOException;
import java.util.List;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * 1、类名
 * 2、严浩
 * 3、2016.11.
 */
public class Ribao extends Fragment{

    private ViewPager pager;
    private RecyclerView recyclerView;
    String path="http://news-at.zhihu.com/api/4/news/latest";
    private MyRibaoAdapter myAdapter;
    private View view;
    private ConvenientBanner convenientBanner;
    private List<MyBean.TopStoriesBean> list2;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate( R.layout.ribao,container,false);

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d("aaaaa","vvvvvvvvvvvvvvvvvvvvvvvvv");
        //初始化
        init();
        //请求数据
        setDatas();

    }
    private void init() {

        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
        convenientBanner = (ConvenientBanner) view.findViewById(R.id.convenientBanner);
    }
    private void setDatas() {
        //创建okhttp对象
        OkHttpClient oc=new OkHttpClient();
        //创建一个Reques
        Request request=new Request.Builder().url(path).build();

        //new call
            Call call=oc.newCall(request);
            call.enqueue(new Callback() {
            //请求失败
            @Override
            public void onFailure(Call call, IOException e) {
                Log.d("aaaaa","vvvvvvvvvvvvvvvvvvvvvvvvv");
            }
            //请求成功
            @Override
            public void onResponse(Call call, Response response) throws IOException {
                final String res=response.body().string();
                Log.i("aaaaa",res);
                getActivity().runOnUiThread(new Runnable() {



                    @Override
                    public void run() {
                        Gson gson=new Gson();
                        MyBean bean=gson.fromJson(res,MyBean.class);
                        List<MyBean.StoriesBean> list=bean.getStories();
                        //设置布局管理器
                        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
                        myAdapter = new MyRibaoAdapter(getActivity(), list);
                        recyclerView.setAdapter(myAdapter);
                        //轮播
                        list2 = bean.getTop_stories();
                        convenientBanner.setPages(
                                new CBViewHolderCreator<LocalImageHolderView>() {
                                    @Override
                                    public LocalImageHolderView createHolder() {
                                        return new LocalImageHolderView();
                                    }
                                }, list2)
                                //设置两个点图片作为翻页指示器，不设置则没有指示器，可以根据自己需求自行配合自己的指示器,不需要圆点指示器可用不设
                                .setPageIndicator(new int[]{R.mipmap.ql_btn_check_off_holo, R.mipmap.ql_btn_check_off_press_holo})
                                //设置指示器的方向
                                .setPageIndicatorAlign(ConvenientBanner.PageIndicatorAlign.ALIGN_PARENT_RIGHT);
                        //设置翻页的效果，不需要翻页效果可用不设
                        //.setPageTransformer(Transformer.DefaultTransformer);    集成特效之后会有白屏现象，新版已经分离，如果要集成特效的例子可以看Demo的点击响应。
//        convenientBanner.setManualPageable(false);//设置不能手动影响
                    }
                });
            }
        });
    }
    @Override
    public void onResume() {
        //开始自动翻页
        convenientBanner.startTurning(3000);
        super.onResume();
    }

    @Override
    public void onPause() {
        list2.clear();//清空集合
        //停止翻页
        convenientBanner.stopTurning();
        super.onPause();
    }

    public class LocalImageHolderView implements Holder<Integer> {
        private ImageView imageView;
        @Override
        public View createView(Context context) {
            imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            return imageView;
        }

        @Override
        public void UpdateUI(Context context, final int position, Integer data) {
            imageView.setImageResource(data);
        }
    }

}
