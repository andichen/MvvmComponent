package com.clf.module_main.adapter;


import com.chad.library.adapter.base.BaseProviderMultiAdapter;
import com.clf.library_base.base.BaseCustomViewModel;
import com.clf.module_main.adapter.provider.FollowCardProvider;
import com.clf.module_main.adapter.provider.NominateItemType;
import com.clf.module_main.adapter.provider.SingleTitleProvider;
import com.clf.module_main.adapter.provider.TitleProvider;
import com.clf.module_main.adapter.provider.VideoCardProvider;

import org.jetbrains.annotations.NotNull;

import java.util.List;


/**
 * 应用模块:
 * <p>
 * 类描述:
 * <p>
 *
 * @author darryrzhoong
 * @since 2020-02-14
 */
public class ProviderNominateAdapter
    extends BaseProviderMultiAdapter<BaseCustomViewModel>
{
    
    public ProviderNominateAdapter()
    {
        super();
        // 注册Provide
        addItemProvider(new TitleProvider());
        addItemProvider(new FollowCardProvider());
        addItemProvider(new SingleTitleProvider());
        addItemProvider(new VideoCardProvider());
        
    }
    
    @Override
    protected int getItemType(@NotNull List<? extends BaseCustomViewModel> data,
        int position)
    {
//        if (data.get(position) instanceof TitleViewModel)
//        {
//            return NominateItemType.TITLE_VIEW;
//        }
//        else if (data.get(position) instanceof FollowCardViewModel)
//        {
//            return NominateItemType.FOLLOW_CARD_VIEW;
//        }
//        else
//
//        if (data.get(position) instanceof SingleTitleViewModel)
//        {
//            return NominateItemType.SINGLE_TITLE_VIEW;
//        }
//        else if (data.get(position) instanceof VideoCardViewModel)
//        {
//            return NominateItemType.VIDEO_CARD_VIEW;
//        }

        return -1;
    }

}
