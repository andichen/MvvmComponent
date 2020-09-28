package com.clf.library_network.serviceapi;


import com.clf.library_network.netbean.AllRecBean;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiService {
    @GET("/api/v5/index/tab/allRec")
    Observable<AllRecBean> getLiveByParam();

    @GET("{url}")
    Observable<AllRecBean> getMoreLiveByParam(@Path("url") String url);


    @GET("/api/v5/index/tab/allRec")
    Call<AllRecBean> getLiveByParam2();

}
