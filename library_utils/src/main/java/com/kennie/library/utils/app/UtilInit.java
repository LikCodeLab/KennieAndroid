package com.kennie.library.utils.app;

import android.app.Application;
import android.util.Log;

public final class UtilInit {

    private static Application sApp;

    private UtilInit() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    /**
     * @param app
     */
    public static void init(final Application app) {
        if (app == null) {
            Log.e("UtilInit", "Application is null");
            return;
        }
        if (sApp == null) {
            sApp = app;
            return;
        }
        if (sApp.equals(app)) return;
        sApp = app;
    }

    public static Application getsApp() {
        if (sApp != null) return sApp;
        throw new NullPointerException("reflect failed.");
    }
}
