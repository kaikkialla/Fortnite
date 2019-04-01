package com.example.fortnite.dagger;

import com.example.fortnite.Executor;
import com.example.fortnite.model.RoomModel;
import com.example.fortnite.model.ShopModel;
import com.example.fortnite.repository.ShopRepository;

import dagger.Module;
import dagger.Provides;

@Module
public class MainModule {

    //Класс, который мы где-то будем использовать
    @Provides
    Executor provideExecutor() {
        return Executor.EXECUTOR;
    }

    @Provides
    ShopRepository provideShopRepository() {
        return ShopRepository.getInstance();
    }

    @Provides
    RoomModel provideRoomModel() {
        return provideRoomModel();
    }

    @Provides
    ShopModel provideShopModel() {
        return provideShopModel();
    }
}
