package com.example.parcelabledemo;

import android.app.Application;
import android.content.Context;

/**
 * Created by zhoukaitong on 2021/5/4.
 * Description:
 */
public class MyApp extends Application {

    static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = this.getApplicationContext();
    }

    public static Context getCtx() {
        return context;
    }

}
