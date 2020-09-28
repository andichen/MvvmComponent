package com.clf.module_main.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.database.DatabaseUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.bumptech.glide.Glide;
import com.clf.library_base.base.BaseCustomViewModel;
import com.clf.library_common.utils.DateTimeUtils;
import com.clf.library_network.netbean.AllRecBean;
import com.clf.library_network.netbean.SquareCardBean;
import com.clf.library_network.netbean.TextCardBean;
import com.clf.library_network.netbean.viewmodel.BannerCardViewModel;
import com.clf.library_network.netbean.viewmodel.FollowCardViewModel;
import com.clf.library_network.netbean.viewmodel.SingleTitleViewModel;
import com.clf.library_network.netbean.viewmodel.TitleViewModel;
import com.clf.library_network.netbean.viewmodel.VideoCardViewModel;
import com.clf.module_main.R;
import com.clf.module_main.bean.CustomBean;
import com.clf.module_main.ui.GuideActivity;
import com.clf.module_main.ui.main3.Main3Activity;
import com.clf.module_main.viewholder.CustomPageViewHolder;
import com.zhpan.bannerview.BannerViewPager;
import com.zhpan.bannerview.adapter.OnPageChangeListenerAdapter;
import com.zhpan.bannerview.holder.HolderCreator;
import com.zhpan.bannerview.holder.ViewHolder;
import com.zhpan.bannerview.utils.BannerUtils;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class NominateAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> implements HolderCreator{


    private Context context;
    private List<BaseCustomViewModel> viewModelList;


    public NominateAdapter(Context context, List<BaseCustomViewModel> datasBean) {
        this.context = context;
        this.viewModelList = datasBean;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        if (viewType == NominateItemType.BANNER_VIEW) {
            View view = LayoutInflater.from(context).inflate(R.layout.home_item_banner_view, parent, false);
            return new BannerViewModelHolder(view);

        }

        if (viewType == NominateItemType.TitleViewModel) {
            View view = LayoutInflater.from(context).inflate(R.layout.home_item_title_left_right_view, parent, false);
            return new TitleViewModelHolder(view);

        }
        if (viewType == NominateItemType.FollowCardViewModel) {
            View view = LayoutInflater.from(context).inflate(R.layout.home_item_follow_card_view, parent, false);
            return new FollowCardViewModelHolder(view);
        }
        if (viewType == NominateItemType.SingleTitleViewModel) {
            View view = LayoutInflater.from(context).inflate(R.layout.home_item_single_title_view, parent, false);
            return new SingleTitleViewModelHolder(view);

        }
        if (viewType == NominateItemType.VideoCardViewModel) {
            View view = LayoutInflater.from(context).inflate(R.layout.home_item_video_card_view, parent, false);

            return new VideoCardViewModelHolder(view);
        }

        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        BaseCustomViewModel baseCustomViewModel = viewModelList.get(position);

        if (baseCustomViewModel instanceof BannerCardViewModel) {
            BannerCardViewModel titleViewModel = (BannerCardViewModel) baseCustomViewModel;
            BannerViewModelHolder titleViewModelHolder = (BannerViewModelHolder) holder;
            titleViewModelHolder.bv_top.setAutoPlay(true) //自动播放
                    .setCanLoop(true)  //可以循环
                    .setInterval(3000) //间隔时间
//                .setPageMargin(getResources().getDimensionPixelOffset(R.dimen.main_dp_10))
//                .setRevealWidth(getResources().getDimensionPixelOffset(R.dimen.main_dp_30))
//                .setRevealWidth(0, 0)

//                .setPageStyle(PageStyle.MULTI_PAGE_SCALE)  //连贯展示，

                    .setPageTransformerStyle(16)//滑动动画样式0，2，4，8，16，32
                    .setScrollDuration(1300)  //滑动动画完成时间
                    .setIndicatorMargin(0, 0, 0, (int) context.getResources().getDimension(R.dimen.main_dp_30))  //指示针位置
                    .setIndicatorGap((int) context.getResources().getDimension(R.dimen.main_dp_10))  //指示针 间隔距离
                    .setIndicatorColor(ContextCompat.getColor(context, R.color.common_colorWhite), ContextCompat.getColor(context, R.color.colorAccent)) //前后颜色
                    .setIndicatorSlideMode(3) //滑动指示标的动画样式3-粘性动画
                    .setIndicatorRadius((int) context.getResources().getDimension(R.dimen.main_dp_4_5), (int) context.getResources().getDimension(R.dimen.main_dp_4_5)) //前后大小
                    .setOnPageClickListener(new BannerViewPager.OnPageClickListener() {
                        @Override
                        public void onPageClick(int position) {
//                            startActivity(new Intent(GuideActivity.this, Main3Activity.class));
                        }
                    })
                    .setHolderCreator((HolderCreator) this).create(getData(titleViewModel.banners));

        }

        if (baseCustomViewModel instanceof TitleViewModel) {
            TitleViewModel titleViewModel = (TitleViewModel) baseCustomViewModel;
            TitleViewModelHolder titleViewModelHolder = (TitleViewModelHolder) holder;
            titleViewModelHolder.tv_title.setText(titleViewModel.title);
            titleViewModelHolder.tv_action_title.setText(titleViewModel.actionTitle);

        } else if (baseCustomViewModel instanceof FollowCardViewModel) {
            FollowCardViewModel followCardViewModel = (FollowCardViewModel) baseCustomViewModel;
            FollowCardViewModelHolder followCardViewModelHolder = (FollowCardViewModelHolder) holder;
            Glide.with(context).load(followCardViewModel.coverUrl).into(followCardViewModelHolder.iv_video_cover);
            Glide.with(context).load(followCardViewModel.authorUrl).into(followCardViewModelHolder.iv_author);
            followCardViewModelHolder.tv_video_time.setText(DateTimeUtils.format(followCardViewModel.videoTime));
            followCardViewModelHolder.tv_title.setText(followCardViewModel.title);
            followCardViewModelHolder.tv_description.setText(followCardViewModel.description);

        } else if (baseCustomViewModel instanceof SingleTitleViewModel) {
            SingleTitleViewModel singleTitleViewModel = (SingleTitleViewModel) baseCustomViewModel;
            SingleTitleViewModelHolder singleTitleViewModelHolder = (SingleTitleViewModelHolder) holder;
            singleTitleViewModelHolder.tv_title.setText(singleTitleViewModel.title);

        } else if (baseCustomViewModel instanceof VideoCardViewModel) {
            VideoCardViewModel videoCardViewModel = (VideoCardViewModel) baseCustomViewModel;
            VideoCardViewModelHolder videoCardViewModelHolder = (VideoCardViewModelHolder) holder;
            Glide.with(context).load(videoCardViewModel.coverUrl).into(videoCardViewModelHolder.iv_video_cover);
            videoCardViewModelHolder.tv_video_time.setText(DateTimeUtils.format(videoCardViewModel.videoTime));
            videoCardViewModelHolder.tv_video_title.setText(videoCardViewModel.title);
            videoCardViewModelHolder.textView.setText(videoCardViewModel.description);

        }


    }

    @Override
    public int getItemCount() {
        return viewModelList.size();
    }

    @Override
    public int getItemViewType(int position) {
        if (viewModelList != null) {

            BaseCustomViewModel baseCustomViewModel = viewModelList.get(position);
            if (baseCustomViewModel instanceof TitleViewModel) {
                return NominateItemType.TitleViewModel;
            } else if (baseCustomViewModel instanceof FollowCardViewModel) {
                return NominateItemType.FollowCardViewModel;
            } else if (baseCustomViewModel instanceof SingleTitleViewModel) {
                return NominateItemType.SingleTitleViewModel;
            } else if (baseCustomViewModel instanceof VideoCardViewModel) {
                return NominateItemType.VideoCardViewModel;
            } else if (baseCustomViewModel instanceof BannerCardViewModel) {
                return NominateItemType.BANNER_VIEW;
            }
        }
        return super.getItemViewType(position);
    }

    @NotNull
    public CustomPageViewHolder createViewHolder() {
        CustomPageViewHolder customPageViewHolder = new CustomPageViewHolder(context);
        customPageViewHolder.setOnSubViewClickListener((new CustomPageViewHolder.OnSubViewClickListener() {
            @SuppressLint("WrongConstant")
            public final void onViewClick(View $noName_0, int position) {
//                Toast.makeText((Context) GuideActivity.this, (CharSequence) ("Logo Clicked,Item: " + position), 1500).show();
            }
        }));
        return customPageViewHolder;
    }

    private final List getData(ArrayList<String> banners) {
        ArrayList list = new ArrayList();
        for (int i = 0; i < banners.size(); ++i) {
            CustomBean customBean = new CustomBean();
            customBean.setImgUrl(banners.get(i));
            list.add(customBean);
        }
        return (List) list;
    }

    public class BannerViewModelHolder extends RecyclerView.ViewHolder {


        private final BannerViewPager bv_top;

        public BannerViewModelHolder(View itemView) {
            super(itemView);
            bv_top = itemView.findViewById(R.id.bv_top);

        }
    }

    public class TitleViewModelHolder extends RecyclerView.ViewHolder {

        private TextView tv_title;
        private TextView tv_action_title;

        public TitleViewModelHolder(View itemView) {
            super(itemView);
            tv_title = itemView.findViewById(R.id.tv_title);
            tv_action_title = itemView.findViewById(R.id.tv_action_title);

        }
    }

    public class FollowCardViewModelHolder extends RecyclerView.ViewHolder {

        private ImageView iv_video_cover, iv_author, iv_share;
        private TextView tv_video_time, tv_title, tv_description;

        public FollowCardViewModelHolder(View itemView) {
            super(itemView);
            iv_video_cover = itemView.findViewById(R.id.iv_video_cover);
            iv_author = itemView.findViewById(R.id.iv_author);
            iv_share = itemView.findViewById(R.id.iv_share);
            tv_video_time = itemView.findViewById(R.id.tv_video_time);
            tv_title = itemView.findViewById(R.id.tv_title);
            tv_description = itemView.findViewById(R.id.tv_description);

        }
    }

    public class SingleTitleViewModelHolder extends RecyclerView.ViewHolder {
        private TextView tv_title;

        public SingleTitleViewModelHolder(View itemView) {
            super(itemView);
            tv_title = itemView.findViewById(R.id.tv_title);


        }
    }

    public class VideoCardViewModelHolder extends RecyclerView.ViewHolder {

        private ImageView iv_video_cover;
        private TextView tv_video_time, tv_video_title, textView;

        public VideoCardViewModelHolder(View itemView) {
            super(itemView);
            iv_video_cover = itemView.findViewById(R.id.iv_video_cover);
            tv_video_time = itemView.findViewById(R.id.tv_video_time);
            tv_video_title = itemView.findViewById(R.id.tv_video_title);
            textView = itemView.findViewById(R.id.textView);

        }
    }

    public void setadapter(List<BaseCustomViewModel> datasBean) {

        this.viewModelList = datasBean;
        notifyDataSetChanged();
    }

    public interface NominateItemType {
        int BANNER_VIEW = 1;

        int TitleViewModel = 2;

        int FollowCardViewModel = 3;

        int SingleTitleViewModel = 4;

        int VideoCardViewModel = 5;

    }

}
