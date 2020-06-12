package com.clf.library_network;

/**
 * Created by clf on 2019/5/19.
 */
public interface SubscriberOnListener<T> {

    void onSucceed(T data);

    void onError(int code, String msg);
}
