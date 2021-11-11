package com.kennie.example.project.base

import com.kennie.library.utils.ActivityManager
import com.kennie.library.utils.app.App
import com.tencent.mmkv.MMKV

class AppApplication : App() {

    override fun onCreate() {
        super.onCreate()
        initSDK(this);
    }

    private fun initSDK(application: AppApplication) {

        // Activity 栈管理初始化
        ActivityManager.getInstance().init(application);

        // MMKV 初始化
        MMKV.initialize(application);
    }

}