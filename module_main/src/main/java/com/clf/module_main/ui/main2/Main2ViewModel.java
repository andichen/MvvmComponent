package com.clf.module_main.ui.main2;

import android.util.Log;

import com.clf.library_base.model.BaseModel;
import com.clf.library_base.model.IBaseModelListener;
import com.clf.library_base.model.IModelListener;
import com.clf.library_base.viewmodel.IMvvmBaseViewModel;
import com.clf.library_base.viewmodel.MvmBaseViewModel;
import com.clf.library_network.netbean.AllRecBean;

public class Main2ViewModel extends MvmBaseViewModel<IMain2View,Main2Model> implements IModelListener {


    @Override
    protected void initModel() {

        model = new Main2Model();
        model.register(this);
        model.load();
    }


    @Override
    public void onLoadFinish(BaseModel model, Object data) {

//        AllRecBean allRecBean = (AllRecBean) data;
//        Log.i("chen", allRecBean.getNextPageUrl());
//        if (getPageView() != null) {
//            getPageView().onDataLoadFinish((AllRecBean) data);
//        }


    }

    @Override
    public void onLoadFail(BaseModel model, String prompt) {

    }
}
