package com.clf.module_main.ui;

import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.clf.module_main.R;
import com.clf.module_main.ui.fragment.HomeFragment;
import com.clf.module_main.ui.main3.Main3Activity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;

import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

public class BottomActivity extends AppCompatActivity {
    private TextView mTextMessage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom);
        FrameLayout fragment = findViewById(R.id.fragment);
        //必需继承FragmentActivity,嵌套fragment只需要这行代码
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment, new HomeFragment()).commitAllowingStateLoss();
    }
    public static void start(Context context) {
        context.startActivity(new Intent(context, BottomActivity.class));
    }


}
