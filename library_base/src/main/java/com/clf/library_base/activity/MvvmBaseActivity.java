package com.clf.library_base.activity;

import android.os.Bundle;

import androidx.annotation.LayoutRes;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;

import com.clf.library_base.viewmodel.IMvvmBaseViewModel;

public abstract class MvvmBaseActivity<V extends ViewDataBinding, VM extends IMvvmBaseViewModel> extends AppCompatActivity implements IBaseView{
    protected VM viewModel;
    protected V viewDataBinding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initViewModel();
        performDataBinding();
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (null != viewModel && viewModel.isUiAttach())
        {
            viewModel.detachUi();
        }
    }

    private void initViewModel()
    {
        viewModel = getViewModel();
        if (null != viewModel)
        {
            viewModel.attachUi(this);
        }
    }
    private void performDataBinding()
    {
        viewDataBinding = DataBindingUtil.setContentView(this, getLayoutId());
        this.viewModel = viewModel == null ? getViewModel() : viewModel;
        if (getBindingVariable() > 0)
        {
            viewDataBinding.setVariable(getBindingVariable(), viewModel);
        }
        viewDataBinding.executePendingBindings();
    }
    /**
     * 获取viewModel
     */
    protected abstract VM getViewModel();
    /**
     * 获取参数Variable
     */
    protected abstract int getBindingVariable();

    @LayoutRes
    protected abstract int getLayoutId();

    @Override
    public void showContent() {

    }

    @Override
    public void showLoading() {

    }

    @Override
    public void showEmpty() {

    }

    @Override
    public void showFailure(String message) {

    }
}
