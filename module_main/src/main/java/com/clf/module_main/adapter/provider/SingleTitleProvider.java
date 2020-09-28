package com.clf.module_main.adapter.provider;

import androidx.databinding.DataBindingUtil;

import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.clf.library_base.base.BaseCustomViewModel;
import com.clf.module_main.R;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * 应用模块:
 * <p>
 * 类描述:
 * <p>
 *
 * @author darryrzhoong
 * @since 2020-02-14
 */
public class SingleTitleProvider extends BaseItemProvider<BaseCustomViewModel>
{
    
    @Override
    public int getItemViewType()
    {
        return NominateItemType.SINGLE_TITLE_VIEW;
    }
    
    @Override
    public int getLayoutId()
    {
        return R.layout.home_item_single_title_view;
    }
    
    @Override
    public void onViewHolderCreated(BaseViewHolder viewHolder, int viewType)
    {
        DataBindingUtil.bind(viewHolder.itemView);
    }
    
    @Override
    public void convert(@NotNull BaseViewHolder baseViewHolder,
        @Nullable BaseCustomViewModel baseCustomViewModel)
    {
        if (baseCustomViewModel == null)
        {
            return;
        }
        

    }
}
