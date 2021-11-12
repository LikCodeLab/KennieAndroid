package com.kennie.example.lib;

import android.content.Context;
import android.content.Intent;

import com.kennie.base.project.core.BaseActivity;
import com.kennie.library.views.setting.SwitchSettingItem;

public class SettingItemActivity extends BaseActivity {

    public static void start(Context context) {
        context.startActivity(new Intent(context, SettingItemActivity.class));
    }

    @Override
    public int getLayoutId() {
        return R.layout.setting_item_layout;
    }

    @Override
    public void initView() {
        SwitchSettingItem item = findViewById(R.id.test);
        item.setEnabled(false);
        item.setChecked(true);
    }

    @Override
    public void initData() {

    }
}
