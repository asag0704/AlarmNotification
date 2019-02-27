package com.coneat.myapplication;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        initNotification();
    }

    private void initNotification() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationManager.createChannel(this);
        }
    }
}
