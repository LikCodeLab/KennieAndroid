package com.kennie.example.project;

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
}
