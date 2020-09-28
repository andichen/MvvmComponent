package com.clf.module_main.ui.main3;


import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bruce on 2016/11/1.
 * ViewPagerAdapter
 */

public class ViewPagerAdapter extends FragmentPagerAdapter {

    public ViewPagerAdapter(@NonNull FragmentManager fm, List<Fragment> fragments) {
        super(fm);
        this.fragments = fragments;
    }

    private List<Fragment> fragments;

    public ViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        if (fragments != null && fragments.size() > 0) {
            return fragments.get(position);
        }
        return null;
    }

    @Override
    public int getCount() {
        if (fragments != null && fragments.size() > 0) {
            return fragments.size();
        }
        return 0;
    }

    public void setData(List<Fragment> data) {
        if (fragments == null) {
            fragments = new ArrayList<>();
        }
        fragments.addAll(data);
        notifyDataSetChanged();
    }

}
