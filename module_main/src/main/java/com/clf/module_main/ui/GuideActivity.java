package com.clf.module_main.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.clf.module_main.R;
import com.zhpan.bannerview.BannerViewPager;

class GuideActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);
        BannerViewPager bannerViewPager = findViewById(R.id.viewpager);



    }
}
