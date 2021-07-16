package com.clf.module_main.ui.fragment;


import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.clf.library_base.base.BaseApplication;
import com.clf.library_base.base.BaseCustomViewModel;
import com.clf.library_base.fragment.BaseFragment;
import com.clf.library_network.netbean.AllRecBean;
import com.clf.library_network.netbean.FollowCardBean;
import com.clf.library_network.netbean.ItemListBean;
import com.clf.library_network.netbean.SquareCardBean;
import com.clf.library_network.netbean.TextCardBean;
import com.clf.library_network.netbean.VideoSmallCardBean;
import com.clf.library_network.netbean.demo;
import com.clf.library_network.netbean.viewmodel.BannerCardViewModel;
import com.clf.library_network.netbean.viewmodel.FollowCardViewModel;
import com.clf.library_network.netbean.viewmodel.SingleTitleViewModel;
import com.clf.library_network.netbean.viewmodel.TitleViewModel;
import com.clf.library_network.netbean.viewmodel.VideoCardViewModel;
import com.clf.library_network.serviceapi.SubjectApi;
import com.clf.library_network.subscribers.HttpSubscriber;
import com.clf.library_network.subscribers.SubscriberOnListener;
import com.clf.module_main.R;
import com.clf.module_main.adapter.NominateAdapter;
import com.clf.module_main.bean.CustomBean;
import com.clf.module_main.ui.GuideActivity;
import com.clf.module_main.viewholder.CustomPageViewHolder;
import com.clf.module_main.views.footer.ClassicsFooter;
import com.clf.module_main.views.header.BezierRadarHeader;
import com.clf.module_main.views.header.ClassicsHeader;
import com.google.gson.Gson;
import com.google.gson.internal.LinkedTreeMap;
import com.kingja.loadsir.core.LoadSir;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;
import com.scwang.smart.refresh.layout.api.RefreshLayout;
import com.scwang.smart.refresh.layout.listener.OnLoadMoreListener;
import com.zhpan.bannerview.holder.HolderCreator;
import com.zhpan.bannerview.holder.ViewHolder;

import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/*
 * 推荐
 * */

public class NominateFragment extends BaseFragment {

    private SmartRefreshLayout refreshLayout;
    private RecyclerView recyclerView;
    private NominateAdapter adapter;
    private List<BaseCustomViewModel> viewModelList = new ArrayList<>();
    private String nextPageUrl;
    private Handler handler = new Handler(Looper.getMainLooper());

    @Override
    protected int getLayoutId() {
        return R.layout.home_fragment_nominate;
    }


    @Override
    protected void initView() {
        refreshLayout = findView(R.id.refreshLayout);
        recyclerView = findView(R.id.recycleview);

        // 确定Item的改变不会影响RecyclerView的宽高
        recyclerView.setHasFixedSize(true);
        recyclerView
                .setLayoutManager(new LinearLayoutManager(getContext()));
        adapter = new NominateAdapter(getActivity(), viewModelList);
//        adapter.addHeaderView(getHeaderView());
        recyclerView.setAdapter(adapter);
        refreshLayout
                .setRefreshHeader(new BezierRadarHeader(getContext()));
        refreshLayout
                .setRefreshFooter(new ClassicsFooter(getContext()));
        refreshLayout.setOnRefreshListener(refreshLayout -> {
            initData();
        });

        String a="";
        refreshLayout.setEnableLoadMoreWhenContentNotFull(false);   // 防止没数据，依然可以加载更多
        refreshLayout.setEnableAutoLoadMore(false);   // 必须手动上拉才加载

        refreshLayout.setOnLoadMoreListener(refreshLayout -> {
            System.out.println("ccccccccc" + nextPageUrl);
            OkHttpClient okHttpClient = new OkHttpClient();
            Request request = new Request.Builder().url(nextPageUrl).build();
            Call call = okHttpClient.newCall(request);
            call.enqueue(new Callback() {
                @Override
                public void onFailure(Call call, IOException e) {
                    String s = e.toString();
                    refreshLayout.finishLoadMore(false);

                }

                @Override
                public void onResponse(Call call, Response response) throws IOException {
                    String string = response.body().string();
                    Gson gson = new Gson();
                    AllRecBean allRecBean = gson.fromJson(string, AllRecBean.class);
                    handler.post(new Runnable() {
                        @Override
                        public void run() {
                            refreshLayout.finishLoadMore(true);
                            onSuccess(allRecBean);
                        }
                    });


                }
            });

//            SubjectApi.getInstance().getMoreLiveList(new HttpSubscriber<AllRecBean>(new SubscriberOnListener<AllRecBean>() {
//                @Override
//                public void onSucceed(AllRecBean data) {
//                    refreshLayout.finishLoadMore(true);
//                    onSuccess(data);
//                }
//
//                @Override
//                public void onError(int code, String msg) {
//
//                    String s = msg;
//                    refreshLayout.finishLoadMore(false);
//
//                }
//            }, BaseApplication.getInstance()), "http://baobab.kaiyanapp.com/api/v5/index/tab/allRec?page=1&isTag=true&adIndex=5");
        });

    }

    @Override
    protected void initData() {


//        封装网络请求
        SubjectApi.getInstance().getLiveList(new HttpSubscriber<AllRecBean>(new SubscriberOnListener<AllRecBean>() {
            @Override
            public void onSucceed(AllRecBean data) {


                refreshLayout.finishRefresh(true);
                viewModelList.clear();
                onSuccess(data);

                Toast.makeText(getContext(),"刷新成功",Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onError(int code, String msg) {
                refreshLayout.finishRefresh(false);
                String s = msg;
            }
        }, BaseApplication.getInstance()));

    }

    private void onSuccess(AllRecBean data) {

        Gson gson = new Gson();
        nextPageUrl = data.getNextPageUrl();
        String json = new Gson().toJson(data.getItemList());
        try {
            JSONArray itemList = new JSONArray(json);
            BannerCardViewModel bannerCardViewModel = new BannerCardViewModel();
            bannerCardViewModel.banners = new ArrayList<>();
            bannerCardViewModel.banners.add("http://img.kaiyanapp.com/482c741c06644f5566c7218096dbaf26.jpeg");
            bannerCardViewModel.banners.add("http://img.kaiyanapp.com/482c741c06644f5566c7218096dbaf26.jpeg");
            bannerCardViewModel.banners.add("http://img.kaiyanapp.com/482c741c06644f5566c7218096dbaf26.jpeg");
            bannerCardViewModel.banners.add("http://img.kaiyanapp.com/482c741c06644f5566c7218096dbaf26.jpeg");
            viewModelList.add(bannerCardViewModel);

            for (int i = 0; i < itemList.length(); i++) {
                JSONObject jsonObjectItem = itemList.optJSONObject(i);
                String type = jsonObjectItem.optString("type");
                String s = jsonObjectItem.toString();
                switch (type) {
                    case "squareCardCollection":  //这是 总标题+n个视频

                        SquareCardBean squareCardBean = gson.fromJson(s, SquareCardBean.class);

                        //第一种 TitleViewModel
                        TitleViewModel titleViewModel = new TitleViewModel();
                        titleViewModel.title = squareCardBean.getData().getHeader().getTitle();
                        titleViewModel.actionTitle = squareCardBean.getData().getHeader().getRightText();
                        viewModelList.add(titleViewModel);


                        //第二种FollowCardViewModel
                        List<FollowCardBean> followCardBeans = squareCardBean.getData().getItemList();
                        for (int i1 = 0; i1 < followCardBeans.size(); i1++) {
                            FollowCardBean cardBean = followCardBeans.get(i1);
                            parseFolliwCardViewModel(cardBean);
                        }

                        break;
                    case "textCard":
                        TextCardBean textCardBean = gson.fromJson(s, TextCardBean.class);

                        SingleTitleViewModel singleTitleViewModel = new SingleTitleViewModel();
                        singleTitleViewModel.title = textCardBean.getData().getText();
                        viewModelList.add(singleTitleViewModel);


                        break;
                    case "videoSmallCard":
                        String dd = jsonObjectItem.toString();
                        VideoSmallCardBean videoSmallCardBean = gson.fromJson(s, VideoSmallCardBean.class);
                        VideoCardViewModel videoCardViewModel = new VideoCardViewModel();
                        videoCardViewModel.coverUrl =
                                videoSmallCardBean.getData().getCover().getDetail();
                        videoCardViewModel.videoTime =
                                videoSmallCardBean.getData().getDuration();
                        videoCardViewModel.title = videoSmallCardBean.getData().getTitle();
                        videoCardViewModel.description =
                                videoSmallCardBean.getData().getAuthor().getName() + " / # "
                                        + videoSmallCardBean.getData().getCategory();
                        videoCardViewModel.authorUrl = videoSmallCardBean.getData().getAuthor().getIcon();
                        videoCardViewModel.userDescription = videoSmallCardBean.getData().getAuthor().getDescription();
                        videoCardViewModel.nickName = videoSmallCardBean.getData().getAuthor().getName();
                        videoCardViewModel.video_description = videoSmallCardBean.getData().getDescription();
                        videoCardViewModel.playerUrl = videoSmallCardBean.getData().getPlayUrl();
                        videoCardViewModel.blurredUrl = videoSmallCardBean.getData().getCover().getBlurred();
                        videoCardViewModel.videoId = videoSmallCardBean.getData().getId();
                        videoCardViewModel.collectionCount = videoSmallCardBean.getData().getConsumption().getCollectionCount();
                        videoCardViewModel.shareCount = videoSmallCardBean.getData().getConsumption().getShareCount();
                        viewModelList.add(videoCardViewModel);


                        break;
                    case "followCard":
                        String aa = jsonObjectItem.toString();
                        FollowCardBean cardBean = gson.fromJson(s, FollowCardBean.class);
                        parseFolliwCardViewModel(cardBean);

                        break;
                    default:
                        break;

                }

            }
        } catch (JSONException e) {
            e.printStackTrace();
        }


        //                List<AllRecBean.ItemListBeanX> itemList = data.getItemList();
        viewModelList.addAll(viewModelList);
////                adapter.setadapter(datasBean);
        adapter.notifyDataSetChanged();
    }

    private void parseFolliwCardViewModel(FollowCardBean cardBean) {
        FollowCardViewModel followCardViewModel = new FollowCardViewModel();

        followCardViewModel.coverUrl =
                cardBean.getData().getContent().getData().getCover().getDetail();
        followCardViewModel.videoTime =
                cardBean.getData().getContent().getData().getDuration();
        if (cardBean.getData().getContent().getData().getAuthor() == null) {
            return;
        }
        followCardViewModel.authorUrl =
                cardBean.getData().getContent().getData().getAuthor().getIcon();
        followCardViewModel.description =
                cardBean.getData().getContent().getData().getAuthor().getName()
                        + " / #"
                        + cardBean.getData().getContent().getData().getCategory();
        followCardViewModel.title =
                cardBean.getData().getContent().getData().getTitle();
        followCardViewModel.nickName = cardBean.getData().getContent().getData().getAuthor().getName();
        followCardViewModel.video_description = cardBean.getData().getContent().getData().getDescription();
        followCardViewModel.userDescription = cardBean.getData().getContent().getData().getAuthor().getDescription();
        followCardViewModel.playerUrl = cardBean.getData().getContent().getData().getPlayUrl();
        followCardViewModel.blurredUrl = cardBean.getData().getContent().getData().getCover().getBlurred();
        followCardViewModel.videoId = cardBean.getData().getContent().getData().getId();
        viewModelList.add(followCardViewModel);
    }

}



