package com.example.fortnite.repository;

import com.example.fortnite.model.ShopModel;
import com.example.fortnite.model.idModel;
import com.example.fortnite.service.Service;

import java.util.List;

import io.reactivex.Observable;
import io.reactivex.subjects.BehaviorSubject;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class idRepository {

    public static idRepository instance;
    //BehaviorSubject<List<String>> platforms = BehaviorSubject.create();
    //BehaviorSubject<List<String>> seasons = BehaviorSubject.create();
    BehaviorSubject<idModel> user = BehaviorSubject.create();

    //BehaviorSubject<String> uid = BehaviorSubject.create();
    private idRepository() {
    }


    public static idRepository getInstance() {
        if (instance == null) {
            instance = new idRepository();
        }
        return instance;
    }

    public void updateID(String username) {
        Service.getInstance().getID(username).enqueue(new Callback<idModel>() {
            @Override
            public void onResponse(Call<idModel> call, Response<idModel> response) {
                if(response.body().getUid() != null) {
                    user.onNext(response.body());
                }

            }

            @Override
            public void onFailure(Call<idModel> call, Throwable t) {

            }
        });
    }


    public Observable<idModel> getUser(String username) {
        updateID(username);
        return user;
    }
}
