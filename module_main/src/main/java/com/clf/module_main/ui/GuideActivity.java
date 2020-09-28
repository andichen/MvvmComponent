package com.clf.module_main.ui;

import androidx.core.content.ContextCompat;
import androidx.viewpager.widget.ViewPager;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.TextView;
import android.widget.Toast;

import com.clf.module_main.R;
import com.clf.module_main.bean.CustomBean;
import com.clf.module_main.ui.main2.Main2Activity;
import com.clf.module_main.ui.main3.Main3Activity;
import com.clf.module_main.viewholder.CustomPageViewHolder;
import com.gyf.immersionbar.BarHide;
import com.gyf.immersionbar.ImmersionBar;
import com.zhpan.bannerview.BannerViewPager;
import com.zhpan.bannerview.adapter.OnPageChangeListenerAdapter;
import com.zhpan.bannerview.holder.HolderCreator;
import com.zhpan.bannerview.utils.BannerUtils;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

//import kotlin.jvm.internal.Intrinsics;

public class GuideActivity extends BaseDataActivity implements HolderCreator {
    //    private BannerViewPager mViewPager;
    private BannerViewPager viewPager;
    private TextView tv_describe;
    private TextView btn_start;

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }

    private final String[] des = new String[]{"在这里\n你可以听到周围人的心声", "在这里\nTA会在下一秒遇见你", "在这里\n不再错过可以改变你一生的人,"};
    private final int[] img_res = new int[]{R.drawable.guide0, R.drawable.guide1, R.drawable.guide2};
    private final int[] transforms = new int[]{0, 8, 4, 2, 16, 32};
    private static final int ANIMATION_DURATION = 1300;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);
        ImmersionBar.with((Activity) this).titleBar(this.findViewById(R.id.top_view)).hideBar(BarHide.FLAG_HIDE_BAR).init();

        tv_describe = (TextView) this.findViewById(R.id.tv_describe);
        viewPager = this.findViewById(R.id.viewpager);
        btn_start = (TextView) this.findViewById(R.id.btn_start);

        setupViewPager();
        updateUI(0);
//        viewPager.create(this.getData());


    }

    private final void setupViewPager() {

        //自动轮播图
//        viewPager.setAutoPlay(true).setCanLoop(true).setPageTransformerStyle(16).setOnPageChangeListener(new OnPageChangeListenerAdapter() {
//            @Override
//            public void onPageSelected(int position) {
//                GuideActivity.this.updateUI(position);
//                if (des.length - 1 == position) {
//                    btn_start.setVisibility(View.VISIBLE);
//                } else {
//                    btn_start.setVisibility(View.GONE);
//                }
//                super.onPageSelected(position);
//            }
//        }).setHolderCreator((HolderCreator) this).create(this.getData());

        //引导页轮播图
        viewPager
                .setAutoPlay(true) //自动播放
                .setCanLoop(true)  //可以循环
                .setInterval(3000) //间隔时间
//                .setPageMargin(getResources().getDimensionPixelOffset(R.dimen.main_dp_10))
//                .setRevealWidth(getResources().getDimensionPixelOffset(R.dimen.main_dp_30))
//                .setRevealWidth(0, 0)

//                .setPageStyle(PageStyle.MULTI_PAGE_SCALE)  //连贯展示，

                .setPageTransformerStyle(16)//滑动动画样式0，2，4，8，16，32
                .setScrollDuration(1300)  //滑动动画完成时间
                .setIndicatorMargin(0, 0, 0, (int) this.getResources().getDimension(R.dimen.main_dp_100))  //指示针位置
                .setIndicatorGap((int) this.getResources().getDimension(R.dimen.main_dp_10))  //指示针 间隔距离
                .setIndicatorColor(ContextCompat.getColor((Context) this, R.color.common_colorWhite), ContextCompat.getColor((Context) this, R.color.colorAccent)) //前后颜色
                .setIndicatorSlideMode(3) //滑动指示标的动画样式3-粘性动画
                .setIndicatorRadius((int) this.getResources().getDimension(R.dimen.main_dp_4_5), (int) this.getResources().getDimension(R.dimen.main_dp_4_5)) //前后大小
                .setOnPageChangeListener((ViewPager.OnPageChangeListener) (new OnPageChangeListenerAdapter() {
                    public void onPageSelected(int position) {
                        BannerUtils.log("position:" + position);
                        GuideActivity.this.updateUI(position);
                        if (des.length - 1 == position) {
                            btn_start.setVisibility(View.VISIBLE);
                        } else {
                            btn_start.setVisibility(View.GONE);
                        }
                    }
                }))
                .setOnPageClickListener(new BannerViewPager.OnPageClickListener() {
                    @Override
                    public void onPageClick(int position) {
                        startActivity(new Intent(GuideActivity.this, Main3Activity.class));
                    }
                })
                .setHolderCreator((HolderCreator) this).create(this.getData());
    }

    private final void updateUI(int position) {

        tv_describe.setText((CharSequence) this.des[position]);
        ObjectAnimator translationAnim = ObjectAnimator.ofFloat(tv_describe, "translationX", new float[]{-120.0F, 0.0F});
        translationAnim.setDuration((long) 1300);
        translationAnim.setInterpolator((TimeInterpolator) (new DecelerateInterpolator()));
        ObjectAnimator alphaAnimator1 = ObjectAnimator.ofFloat(tv_describe, "alpha", new float[]{0.0F, 1.0F});
        alphaAnimator1.setDuration((long) 1300);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{(Animator) translationAnim, (Animator) alphaAnimator1});
        animatorSet.start();


    }

    @NotNull
    public CustomPageViewHolder createViewHolder() {
        CustomPageViewHolder customPageViewHolder = new CustomPageViewHolder(null);
        customPageViewHolder.setOnSubViewClickListener((new CustomPageViewHolder.OnSubViewClickListener() {
            @SuppressLint("WrongConstant")
            public final void onViewClick(View $noName_0, int position) {
                Toast.makeText((Context) GuideActivity.this, (CharSequence) ("Logo Clicked,Item: " + position), 1500).show();
            }
        }));
        return customPageViewHolder;
    }
    private final List getData() {
        ArrayList list = new ArrayList();
        for (int i = 0; i < img_res.length; ++i) {
            CustomBean customBean = new CustomBean();
            customBean.setImageRes(img_res[i]);
            customBean.setImageDescription(des[i]);
            list.add(customBean);
        }
        return (List) list;
    }

    public static void start(Context context) {
        context.startActivity(new Intent(context, GuideActivity.class));
    }
}
