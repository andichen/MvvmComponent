package com.clf.module_main.ui.main3;

import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.clf.library_base.activity.MvvmBaseActivity;
import com.clf.library_base.viewmodel.IMvvmBaseViewModel;
import com.clf.module_main.R;
import com.clf.module_main.databinding.ActivityMain3Binding;
import com.clf.module_main.ui.fragment.DemoFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.gyf.immersionbar.ImmersionBar;

public class Main3Activity extends MvvmBaseActivity<ActivityMain3Binding,IMvvmBaseViewModel> {
    private MenuItem menuItem;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ImmersionBar.with(this)
                .statusBarColor(R.color.main_color_bar)
                .navigationBarColor(R.color.main_color_bar)
                .fitsSystemWindows(true)
                .autoDarkModeEnable(true)
                .init();
        initView();
        initFragment();

    }

    private void initFragment() {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new DemoFragment());
        adapter.addFragment(new DemoFragment());
        adapter.addFragment(new DemoFragment());
        adapter.addFragment(new DemoFragment());
        viewDataBinding.viewPager.setAdapter(adapter);

    }

    private void initView() {
        viewDataBinding.bottomNavigation.inflateMenu(R.menu.menu_bottom_navigation);
        BottomNavigationViewHelper.disableShiftMode(viewDataBinding.bottomNavigation);
        //去除大小变化
        viewDataBinding.bottomNavigation.setItemTextAppearanceActive(R.style.bottom_normal_text);
        viewDataBinding.bottomNavigation.setItemTextAppearanceInactive(R.style.bottom_selected_text);
        viewDataBinding.bottomNavigation.setItemIconTintList(null);
        viewDataBinding.bottomNavigation.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(MenuItem item) {
                        int i = item.getItemId();
                        if (i == R.id.item_main) {
                            viewDataBinding.viewPager.setCurrentItem(0);
                        } else if (i == R.id.item_jyfx) {
                            viewDataBinding.viewPager.setCurrentItem(1);
                        } else if (i == R.id.item_ywyy) {
                            viewDataBinding.viewPager.setCurrentItem(2);
                        } else if (i == R.id.item_scfx) {
                            viewDataBinding.viewPager.setCurrentItem(3);
                        }
                        return false;
                    }
                });
        viewDataBinding.viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }

            @Override
            public void onPageSelected(int position) {
                if (menuItem != null) {
                    menuItem.setChecked(false);
                } else {
                    viewDataBinding.bottomNavigation.getMenu().getItem(0).setChecked(false);
                }
                menuItem = viewDataBinding.bottomNavigation.getMenu().getItem(position);
                menuItem.setChecked(true);
            }

            @Override
            public void onPageScrollStateChanged(int state) {
            }

        });

    }


    @Override
    protected IMvvmBaseViewModel getViewModel() {
        return null;
    }

    @Override
    protected int getBindingVariable() {
        return 0;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main3;
    }

    public static void start(Context context) {
        context.startActivity(new Intent(context, Main3Activity.class));
    }
}
