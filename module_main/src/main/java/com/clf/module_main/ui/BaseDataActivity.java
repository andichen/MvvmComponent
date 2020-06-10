package com.clf.module_main.ui;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

import kotlin.jvm.internal.Intrinsics;

public class BaseDataActivity extends AppCompatActivity {

    @NotNull
    public List mDrawableList = (List)(new ArrayList());

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        int i = 0;
//
//        for(byte var2 = 2; i <= var2; ++i) {
//            int drawable = this.getResources().getIdentifier("guide" + i, "drawable", this.getPackageName());
//            mDrawableList.add(drawable);
//        }
    }

    @NotNull
    protected final List getMDrawableList() {
        return this.mDrawableList;
    }

    protected final void setMDrawableList(@NotNull List var1) {
        Intrinsics.checkParameterIsNotNull(var1, "<set-?>");
        this.mDrawableList = var1;
    }
}
