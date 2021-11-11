package com.kennie.library.utils.config;

/**
 * @author kennie
 * @classname AppStore
 * @description 应用市场包名
 * @Date 2020/4/15
 * @History 2020/4/15 author: description:
 */
public enum AppStore {

    /**
     * 腾讯应用宝
     */
    YING_YONG_BAO("com.tencent.android.qqdownloader"),

    /**
     * 360手机助手
     */
    QI_HOO("com.qihoo.appstore"),

    /**
     * 百度手机助手
     */
    BAI_DU("com.baidu.appsearch"),

    /**
     * 小米应用商店
     */
    XIAO_MI("com.xiaomi.market"),

    /**
     * 华为应用商店
     */
    HUA_WEI("com.huawei.appmarket"),

    /**
     * Google Play Store
     */
    GOOGLE("com.android.vending"),

    /**
     * OPPO应用商店
     */
    OPPO("com.oppo.market"),

    /**
     * VIVO应用商店
     */
    VIVO("com.bbk.appstore"),


    /**
     * 三星应用商店
     */
    SAM_SUNG("com.sec.android.app.samsungapps"),

    /**
     * 联想应用商店
     */
    LENOVO("com.lenovo.leos.appstore"),

    /**
     * 中兴应用商店
     */
    ZHONG_XING("zte.com.market"),

    /**
     * 酷市场
     */
    KU("com.coolapk.market");


    public final String appPackage;

    AppStore(String appPackage) {
        this.appPackage = appPackage;
    }

}
