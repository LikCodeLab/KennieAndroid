package com.kennie.library.views.setting;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewStub;

import com.kennie.library.views.R;

public class SwitchSettingItem extends CheckableSettingItem {

    public SwitchSettingItem(Context context) {
        this(context, null);
    }

    public SwitchSettingItem(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public SwitchSettingItem(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public void inflateRightContainer(ViewStub viewStub) {
        viewStub.setLayoutResource(R.layout.z_setting_right_container_switch);
        viewStub.setInflatedId(R.id.switcher);
        viewStub.inflate();
    }

}

