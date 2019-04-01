package com.example.fortnite;

import android.app.Application;

import com.example.fortnite.dagger.MainComponent;
import com.example.fortnite.repository.ShopRepository;

import javax.inject.Inject;


public class MainApplication extends Application {

    public static MainComponent mainComponent;

    @Inject
    ShopRepository shopRepository;

    @Override
    public void onCreate() {
        super.onCreate();
//        Dagger
        Executor.EXECUTOR.start();
        ShopRepository.getInstance().initialize(getApplicationContext());
    }


}
