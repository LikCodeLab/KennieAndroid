package com.kennie.library.views.setting;

import android.content.Context;
import android.util.AttributeSet;

public class CommonSettingItem extends ZSettingItem {

    private OnCommonItemClickListener listener;

    public CommonSettingItem(Context context) {
        this(context, null);
    }

    public CommonSettingItem(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CommonSettingItem(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public void setOnItemClickListener(OnCommonItemClickListener listener) {
        this.listener = listener;
    }

    @Override
    public void onItemClick() {
        if (listener != null) {
            listener.onItemClick(this);
        }
    }
}

