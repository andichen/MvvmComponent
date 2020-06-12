package com.clf.module_main.ui.main2;

import android.app.Application;
import android.util.Log;

import com.clf.library_base.base.BaseApplication;
import com.clf.library_base.model.BaseModel;
import com.clf.library_network.netbean.AllRecBean;
import com.clf.library_network.clfHttp.NetWorkManager;
import com.clf.library_network.serviceapi.SubjectApi;
import com.clf.library_network.subscribers.HttpSubscriber;
import com.clf.library_network.subscribers.SubscriberOnListener;

import java.nio.channels.NetworkChannel;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

public class Main2Model<T> extends BaseModel<T>  {
    @Override
    protected void load() {

        //封装网络请求
        SubjectApi.getInstance().getLiveList(new HttpSubscriber<AllRecBean>(new SubscriberOnListener<AllRecBean>() {
            @Override
            public void onSucceed(AllRecBean data) {
                loadSuccess((T) data);

            }

            @Override
            public void onError(int code, String msg) {

            }
        }, BaseApplication.getInstance()));




        //方案一    okhttp,retrofit,observer .没封装
//        NetWorkManager.getInstance(); //这个可以在MyAllpication中初始化
//
//        //没封装的请求
//        NetWorkManager.getRequest().getLiveByParam()
//                .subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe(new Consumer<AllRecBean>() {
//                    @Override
//                    public void accept(AllRecBean allRecBean) throws Exception {
//                        Log.i("clf_", allRecBean.getNextPageUrl());
//                    }
//                }, new Consumer<Throwable>() {
//                    @Override
//                    public void accept(Throwable throwable) throws Exception {
//                        Log.i("clf_", throwable.getMessage());
//                    }
//                });


        // 方案二    单独的okhttp

        //第一步获取okHttpClient对象
//        OkHttpClient client = new OkHttpClient.Builder()
//                .build();
//        //第二步构建Request对象
//        Request request = new Request.Builder()
//                .url("http://baobab.kaiyanapp.com/api/v5/index/tab/allRec")
//                .get()
//                .build();
//        //第三步构建Call对象
//        Call call = client.newCall(request);
//        //第四步:异步get请求
//        call.enqueue(new Callback() {
//            @Override
//            public void onFailure(Call call, IOException e) {
//                Log.i("onFailure", e.getMessage());
//            }
//
//            @Override
//            public void onResponse(Call call, Response response) throws IOException {
//                //得到的子线程
//                String result = response.body().string();
//                Log.i("result", result);
//            }
//        });


        //方案三      okhttp，retrofit 结合起来
//        NetWorkManager.getInstance();
//        NetWorkManager.getRequest().getLiveByParam2().enqueue(new Callback<AllRecBean>() {
//            @Override
//            public void onResponse(Call<AllRecBean> call, Response<AllRecBean> response) {
//
//            }
//
//            @Override
//            public void onFailure(Call<AllRecBean> call, Throwable t) {
//
//            }
//        });


    }
}
