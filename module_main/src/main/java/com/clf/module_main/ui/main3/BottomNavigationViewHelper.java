package com.clf.module_main.ui.main3;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.os.Build;

import com.google.android.material.bottomnavigation.BottomNavigationItemView;
import com.google.android.material.bottomnavigation.BottomNavigationMenuView;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.bottomnavigation.LabelVisibilityMode;

import java.lang.reflect.Field;

// 利用反射，改变 item 中 mShiftingMode 的值
public class BottomNavigationViewHelper {



    @TargetApi(Build.VERSION_CODES.KITKAT)
    @SuppressLint("RestrictedApi")

    public static void disableShiftMode(BottomNavigationView navigationView) {

        BottomNavigationMenuView menuView = (BottomNavigationMenuView) navigationView.getChildAt(0);

        //或者直接在xml添加 app:labelVisibilityMode="labeled"
        menuView.setLabelVisibilityMode(LabelVisibilityMode.LABEL_VISIBILITY_LABELED);
//        menuView.buildMenuView();

        for (int i = 0; i < menuView.getChildCount(); i++) {
            BottomNavigationItemView itemView = (BottomNavigationItemView) menuView.getChildAt(i);
            itemView.setShifting(false);
            itemView.setChecked(itemView.getItemData().isChecked());
        }
//        try {
//            Field shiftingMode = menuView.getClass().getDeclaredField("mShiftingMode");
//            shiftingMode.setAccessible(true);
//            shiftingMode.setBoolean(menuView, false);
//            shiftingMode.setAccessible(false);
//
//            for (int i = 0; i < menuView.getChildCount(); i++) {
//                BottomNavigationItemView itemView = (BottomNavigationItemView) menuView.getChildAt(i);
//                itemView.setShifting(false);
//                itemView.setChecked(itemView.getItemData().isChecked());
//            }
//
//        } catch ( NoSuchFieldException | IllegalAccessException e) {
//            e.printStackTrace();
//        }
    }
}