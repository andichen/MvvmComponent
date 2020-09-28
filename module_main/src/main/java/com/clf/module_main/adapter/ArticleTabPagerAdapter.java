package com.clf.module_main.adapter;


import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;


import com.clf.library_base.fragment.BaseFragment;

import java.util.List;

/**
 * @author TangHongChang
 * @version 1.0
 * @date 创建时间： 2018/12/3 5:01 PM
 * @Description 顶部Tab
 * @fileName CommonTabPagerAdapter.java
 */

public class ArticleTabPagerAdapter extends FragmentPagerAdapter {

    private List<String> list;
    private List<Fragment> fragments;

    public ArticleTabPagerAdapter(FragmentManager fm, List<String> list, List<Fragment> fragments) {
        super(fm);
        if (list == null || list.isEmpty()) {
            throw new ExceptionInInitializerError("list can't be null or empty");
        }
        this.list = list;
        this.fragments = fragments;
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }
    @Override
    public int getCount() {
        return list.size();
    }
    @Override
    public CharSequence getPageTitle(int position) {
        return list.get(position);
    }


}
