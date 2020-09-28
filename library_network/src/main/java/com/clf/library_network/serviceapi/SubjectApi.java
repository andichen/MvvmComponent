package com.clf.library_network.serviceapi;


import com.clf.library_network.netbean.AllRecBean;
import com.clf.library_network.service.BaseApi;
import com.clf.library_network.service.HttpMethod;

import java.util.List;

import io.reactivex.Observable;
import io.reactivex.Observer;

public class SubjectApi extends BaseApi {
    public static SubjectApi subjectApi;
    public ApiService apiService;

    public SubjectApi() {
        apiService = HttpMethod.getInstance().createApi(ApiService.class);
    }

    public static SubjectApi getInstance() {
        if (subjectApi == null) {
            subjectApi = new SubjectApi();
        }
        return subjectApi;
    }




    /*------------下面都是网络请求的方法------------*/


    public void getLiveList(Observer<AllRecBean> subscriber) {

        Observable observable = apiService.getLiveByParam();
//                .map(new HttpResultFunc<AllRecBean>()); //这里可以再次解析出来

        toSubscribe(observable, subscriber);

    }

    public void getMoreLiveList(Observer<AllRecBean> subscriber, String nextPageUrl) {

        Observable observable = apiService.getMoreLiveByParam(nextPageUrl);
//                .map(new HttpResultFunc<AllRecBean>()); //这里可以再次解析出来

        toSubscribe(observable, subscriber);

    }


}
