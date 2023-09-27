package com.zfdang;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;

import com.domla.enword.EnWordInitializer;

public class TouchHelperApp extends Application {

    @SuppressLint("StaticFieldLeak")
    private static Context context;

    public TouchHelperApp() {
        super();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        TouchHelperApp.context = getApplicationContext();
        EnWordInitializer.init(this);
    }

    public static Context getAppContext() {
        return context;
    }
}
