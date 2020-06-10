package com.clf.module_main.viewholder;

import android.animation.ObjectAnimator;
import android.view.View;
import android.widget.ImageView;

import com.clf.module_main.R;
import com.clf.module_main.bean.CustomBean;
import com.zhpan.bannerview.holder.ViewHolder;

import java.util.List;


/**
 * 应用模块:
 * <p>
 * 类描述:
 * <p>
 *
 * @author darryrzhoong
 * @since 2020-02-28
 */
public class CustomPageViewHolder implements ViewHolder<CustomBean> {
    private OnSubViewClickListener mOnSubViewClickListener;

    @Override
    public int getLayoutId() {
        return R.layout.main_item_custom_view;
    }


    @Override
    public void onBind(View itemView, CustomBean data, final int position, int size) {
        final ImageView mImageView = itemView.findViewById(R.id.banner_image);

        mImageView.setImageResource(data.getImageRes());
        ObjectAnimator alphaAnimator = ObjectAnimator.ofFloat(mImageView, "alpha", 0, 1);
        alphaAnimator.setDuration(1300);
        alphaAnimator.start();

        mImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mOnSubViewClickListener != null) {
                    mOnSubViewClickListener.onViewClick(mImageView,position);
                }
            }
        });
    }

    public void setOnSubViewClickListener(OnSubViewClickListener subViewClickListener) {
        mOnSubViewClickListener = subViewClickListener;
    }

    public interface OnSubViewClickListener {
        void onViewClick(View view, int position);
    }
}
