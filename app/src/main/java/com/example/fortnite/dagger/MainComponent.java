package com.example.fortnite.dagger;

import com.example.fortnite.repository.ShopRepository;

import dagger.Component;

@Component(modules = MainModule.class)
public interface MainComponent {
    //Класс, в котором мы будем использовать зависимость
    void inject(ShopRepository shopRepository);
}
