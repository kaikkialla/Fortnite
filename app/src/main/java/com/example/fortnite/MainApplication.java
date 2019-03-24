package com.example.fortnite;

import android.app.Application;

import com.example.fortnite.repository.ShopRepository;

public class MainApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Executor.EXECUTOR.start();
        ShopRepository.getInstance().initialize(getApplicationContext());
    }
}
