package com.clf.module_main.ui.main2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.clf.library_base.activity.MvvmBaseActivity;
import com.clf.library_base.model.BaseModel;
import com.clf.library_base.model.IModelListener;
import com.clf.library_base.viewmodel.IMvvmBaseViewModel;
import com.clf.library_network.netbean.AllRecBean;
import com.clf.module_main.R;
import com.clf.module_main.databinding.ActivityMain2Binding;
import com.clf.module_main.ui.GuideActivity;

public class Main2Activity extends MvvmBaseActivity<ActivityMain2Binding,Main2ViewModel> implements IMain2View {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView();
        viewModel.initModel();
    }

    @Override
    protected Main2ViewModel getViewModel() {
        return ViewModelProviders.of(this).get(Main2ViewModel.class);
    }

    private void initView() {

        viewDataBinding.text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }



    @Override
    protected int getBindingVariable() {
        return 0;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main2;
    }
    public static void start(Context context) {
        context.startActivity(new Intent(context, Main2Activity.class));
    }




    @Override
    public void onDataLoadFinish(AllRecBean allRecBean) {
//        viewDataBinding.text.setText(allRecBean.getNextPageUrl());



    }
}
