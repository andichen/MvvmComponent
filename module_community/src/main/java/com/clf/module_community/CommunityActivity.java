package com.clf.module_community;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.gyf.immersionbar.ImmersionBar;

public class CommunityActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_community);
        ImmersionBar.with(this)
                .statusBarColor(R.color.main_color_bar)
                .navigationBarColor(R.color.main_color_bar)
                .fitsSystemWindows(true)
                .autoDarkModeEnable(true)
                .init();
    }


    public static void start(Context context) {
        context.startActivity(new Intent(context, CommunityActivity.class));
    }
}
