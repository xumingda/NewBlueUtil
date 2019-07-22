package com.jingxun.filedstrengthnew;

import android.app.Application;

import com.jingxun.filedstrengthnew.Utils.CrashHandler;
import com.jingxun.filedstrengthnew.Utils.LogcatHelper;
import com.jingxun.filedstrengthnew.service.LocationService;


public class MyApp extends Application {

    public LocationService locationService;
    public static int type=1;

    @Override
    public void onCreate() {
        super.onCreate();

        CrashHandler.getInstance().initialize(this);
        LogcatHelper.getInstance(this).start();

        locationService = new LocationService(getApplicationContext());
    }


}
