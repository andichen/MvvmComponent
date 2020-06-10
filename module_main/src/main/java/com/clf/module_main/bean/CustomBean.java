package com.clf.module_main.bean;

import org.jetbrains.annotations.Nullable;

public class CustomBean {
    private int imageRes;
    @Nullable
    private String imageDescription;
    @Nullable
    private String imgUrl;

    public final int getImageRes() {
        return this.imageRes;
    }

    public final void setImageRes(int var1) {
        this.imageRes = var1;
    }

    @Nullable
    public final String getImageDescription() {
        return this.imageDescription;
    }

    public final void setImageDescription(@Nullable String var1) {
        this.imageDescription = var1;
    }

    @Nullable
    public final String getImgUrl() {
        return this.imgUrl;
    }

    public final void setImgUrl(@Nullable String var1) {
        this.imgUrl = var1;
    }
}
