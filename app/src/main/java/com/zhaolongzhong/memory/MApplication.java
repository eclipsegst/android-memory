package com.zhaolongzhong.memory;

import android.app.Application;

import com.squareup.leakcanary.LeakCanary;


/**
 * created by zhaolong zhong on 4/23/16.
 */
public class MApplication extends Application {
    private static final String TAG = MApplication.class.getSimpleName();

    @Override
    public void onCreate() {
        super.onCreate();
        LeakCanary.install(this);
    }
}
