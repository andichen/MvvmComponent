package com.clf.module_main.views.header;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.clf.module_main.R;

@SuppressLint("AppCompatCustomView")
public class DemoHeader extends View {


    public DemoHeader(Context context, AttributeSet attrs) {
        super(context, attrs, 0);
        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.DemoHeader);
        String test = typedArray.getString(R.styleable.DemoHeader_test);
        int testAttr = typedArray.getInteger(R.styleable.DemoHeader_testAttr, 0);
        Log.i("clf", "test" + test + "testAttr" + testAttr);
        typedArray.recycle();


    }


    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
//        setMeasuredDimension(100,200);

    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override
    public Drawable getBackground() {
        return super.getBackground();
    }
}

