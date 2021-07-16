package com.clf.module_main.ui.fragment;


import android.view.View;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.clf.library_base.fragment.BaseFragment;
import com.clf.module_main.R;
import com.clf.module_main.adapter.ArticleTabPagerAdapter;
import com.clf.module_main.adapter.HomeFragmentPageAdapter;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HomeFragment extends BaseFragment {


    private ViewPager viewpager;

    private HomeFragmentPageAdapter pageAdapter;
    ArticleTabPagerAdapter adapter;
    private TabLayout tablayout;
    private ImageView iv_net_candle;

    @Override
    protected void initData() {

        tablayout = findView(R.id.tab_layout);
        viewpager = findView(R.id.vp_home_content);
        iv_net_candle = findView(R.id.iv_net_candle);
        iv_net_candle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        List<String> strings = Arrays.asList("发现", "推荐", "日报");
        List<Fragment> fragments = new ArrayList<>();

        fragments.add(new NominateFragment());
        fragments.add(new NominateFragment());
        fragments.add(new DemoFragment());
        adapter = new ArticleTabPagerAdapter(getChildFragmentManager(), strings, fragments);
        if (strings.size() > 3) {
            viewpager.setOffscreenPageLimit(3);
        }
        viewpager.setAdapter(adapter);
        tablayout.setupWithViewPager(viewpager);
        tablayout.setTabMode(TabLayout.MODE_SCROLLABLE);
        viewpager.setCurrentItem(1);


    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_home;
    }

    @Override
    protected void initView() {

//        tablayout = findView(R.id.tab_layout);
//        viewpager = findView(R.id.vp_home_content);
//
//
//        List<Fragment> fragments = new ArrayList<>();
//        fragments.add(new DemoFragment2());
//        fragments.add(new DemoFragment());
//        fragments.add(new DemoFragment2());
//
//
//        pageAdapter = new HomeFragmentPageAdapter(getChildFragmentManager(),
//                FragmentPagerAdapter.BEHAVIOR_SET_USER_VISIBLE_HINT);
//        pageAdapter.setData(fragments);
//        viewpager.setAdapter(pageAdapter);
//        tablayout.setupWithViewPager(viewpager);
//        tablayout.setTabMode(TabLayout.MODE_SCROLLABLE);
//        viewpager.addOnPageChangeListener(
//                new TabLayout.TabLayoutOnPageChangeListener(tablayout));
//        tablayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
//            @Override
//            public void onTabSelected(TabLayout.Tab tab) {
//                viewpager.setCurrentItem(tab.getPosition());
//            }
//
//            @Override
//            public void onTabUnselected(TabLayout.Tab tab) {
//
//            }
//
//            @Override
//            public void onTabReselected(TabLayout.Tab tab) {
//
//            }
//        });
//
//
//        viewpager.setCurrentItem(2);
    }
}
