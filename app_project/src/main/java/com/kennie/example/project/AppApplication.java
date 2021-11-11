package com.kennie.example.project;

import com.bumptech.glide.Glide;
import com.kennie.base.project.BaseApp;
import com.kennie.library.utils.ActivityManager;
import com.kennie.library.utils.app.UtilInit;
import com.tencent.mmkv.MMKV;

public class AppApplication extends BaseApp<AppApplication> {
    @Override
    public void init() {

        UtilInit.init(this);
        // Activity 栈管理初始化
        ActivityManager.getInstance().init(this);

        // MMKV 初始化
        MMKV.initialize(this);
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        // 清理所有图片内存缓存
        Glide.get(this).onLowMemory();
    }

    @Override
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
        // 根据手机内存剩余情况清理图片内存缓存
        Glide.get(this).onTrimMemory(level);
    }
}
