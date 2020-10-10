package com.clf.module_main.ui.main3;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.clf.library_common.utils.ColorUtils;
import com.clf.module_main.R;
import com.clf.module_main.ui.fragment.DemoFragment;
import com.clf.module_main.ui.fragment.HomeFragment;
import com.clf.module_main.views.CustomNoTouchViewPager;
import com.gyf.immersionbar.ImmersionBar;

import java.util.ArrayList;
import java.util.List;

import me.majiajie.pagerbottomtabstrip.NavigationController;
import me.majiajie.pagerbottomtabstrip.PageNavigationView;
import me.majiajie.pagerbottomtabstrip.listener.OnTabItemSelectedListener;

public class Main3Activity extends AppCompatActivity {
    private MenuItem menuItem;
    private NavigationController mNavigationController;
    private ViewPagerAdapter adapter;
    private CustomNoTouchViewPager viewpager;
    private PageNavigationView bottomView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        ImmersionBar.with(this)
                .statusBarColor(R.color.main_color_bar)
                .navigationBarColor(R.color.main_color_bar)
                .fitsSystemWindows(true)
                .autoDarkModeEnable(true)
                .init();
        viewpager = findViewById(R.id.viewpager);
        bottomView = findViewById(R.id.bottom_view);
        initFragment();
        initView();

    }

    private void initFragment() {
        List<Fragment> fragments = new ArrayList<>();
        fragments.add(new HomeFragment());
        fragments.add(new HomeFragment());
//        fragments.add((Fragment) ARouter.getInstance().build(RouterFragmentPath.Community.PAGER_COMMUNITY).navigation());
        fragments.add(new DemoFragment());
        fragments.add(new DemoFragment());
        adapter = new ViewPagerAdapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_SET_USER_VISIBLE_HINT);
        adapter.setData(fragments);
    }

    private void initView() {
        String a = "我是不是有点过了，让你不舒服";
        mNavigationController = bottomView.material()
                .addItem(R.drawable.main_home,
                        "首页",
                        ColorUtils.getColor(this, R.color.main_bottom_check_color))
                .addItem(R.drawable.main_community,
                        "社区",
                        ColorUtils.getColor(this, R.color.main_bottom_check_color))
                .addItem(R.drawable.main_notify,
                        "通知",
                        ColorUtils.getColor(this, R.color.main_bottom_check_color))
                .addItem(R.drawable.main_user,
                        "我的",
                        ColorUtils.getColor(this, R.color.main_bottom_check_color))
                .setDefaultColor(
                        ColorUtils.getColor(this, R.color.main_bottom_default_color))
                .enableAnimateLayoutChanges()
                .build();
        //
//        mNavigationController = viewDataBinding.bottomView.material()
//                .addItem(R.drawable.main_home, R.drawable.ic_mainpage_select,
//                        "首页",
//                        ColorUtils.getColor(this, R.color.main_bottom_check_color))
//                .addItem(R.drawable.main_community, R.drawable.ic_mainpage_select,
//                        "社区",
//                        ColorUtils.getColor(this, R.color.main_bottom_check_color))
//                .addItem(R.drawable.main_notify, R.drawable.ic_mainpage_select,
//                        "通知",
//                        ColorUtils.getColor(this, R.color.main_bottom_check_color))
//                .addItem(R.drawable.main_user, R.drawable.ic_mainpage_select,
//                        "我的",
//                        ColorUtils.getColor(this, R.color.main_bottom_check_color))
//                .setDefaultColor(
//                        ColorUtils.getColor(this, R.color.colorAccent))
//                .enableAnimateLayoutChanges()
//                .dontTintIcon()     //不对秃瓢
//                .build();


        mNavigationController.setHasMessage(2, true);
        mNavigationController.setMessageNumber(3, 6);
        mNavigationController.setHasMessage(2, true);
        mNavigationController.setMessageNumber(3, 6);
        mNavigationController.addTabItemSelectedListener(new OnTabItemSelectedListener() {
            @Override
            public void onSelected(int index, int old) {
                Toast.makeText(Main3Activity.this, "哈哈  " + index, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onRepeat(int index) {
                Toast.makeText(Main3Activity.this, "重复点击  " + index, Toast.LENGTH_SHORT).show();

            }
        });

        viewpager.setAdapter(adapter);
        viewpager.setOffscreenPageLimit(2); //预加载2哥
        viewpager.setCurrentItem(0);  //默认显示
        mNavigationController.setupWithViewPager(viewpager);


    }


    public static void start(Context context) {
        context.startActivity(new Intent(context, Main3Activity.class));
    }
}
