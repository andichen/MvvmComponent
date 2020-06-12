package com.clf.library_network.clfHttp;


import com.clf.library_network.netbean.AllRecBean;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {


    @GET("/api/v5/index/tab/allRec")
    Observable<AllRecBean> getLiveByParam();

    @GET("/api/v5/index/tab/allRec")
    Call<AllRecBean> getLiveByParam2();


}
