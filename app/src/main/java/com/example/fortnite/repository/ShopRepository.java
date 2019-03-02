package com.example.fortnite.repository;

import com.example.fortnite.model.ShopModel;
import com.example.fortnite.service.Service;

import java.util.List;

import io.reactivex.Observable;
import io.reactivex.subjects.BehaviorSubject;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ShopRepository {
    public static ShopRepository instance;
    BehaviorSubject<List<ShopModel.Item>> items = BehaviorSubject.create();
    private ShopRepository(){}



    public static ShopRepository getInstance() {
        if (instance == null) {
            instance = new ShopRepository();
        }
        return instance;
    }

    public void updateShop() {
        Service.getInstance().getShop("en").enqueue(new Callback<ShopModel>() {
            @Override
            public void onResponse(Call<ShopModel> call, Response<ShopModel> response) {
                items.onNext(response.body().getItems());
            }

            @Override
            public void onFailure(Call<ShopModel> call, Throwable t) {

            }
        });
    }

    public Observable<List<ShopModel.Item>> getTransactions() {
        updateShop();
        return items;
    }
}
