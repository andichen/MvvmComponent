package com.clf.module_main.ui.main2;

import com.clf.library_base.activity.IBaseView;
import com.clf.library_network.netbean.AllRecBean;

import java.util.ArrayList;

public interface IMain2View extends IBaseView {
    /**
     * 数据加载完成
     *
     *
     */
    void onDataLoadFinish(AllRecBean allRecBean);

}
