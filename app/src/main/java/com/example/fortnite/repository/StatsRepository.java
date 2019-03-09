package com.example.fortnite.repository;

import com.example.fortnite.model.StatsModel;
import com.example.fortnite.service.Service;

import io.reactivex.Observable;
import io.reactivex.subjects.BehaviorSubject;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class StatsRepository {


    public static StatsRepository instance;
    BehaviorSubject<StatsModel> stats = BehaviorSubject.create();


    public static StatsRepository getInstance() {
        if (instance == null) {
            instance = new StatsRepository();
        }
        return instance;
    }


    public void updateStats(String uid) {
        Service.getInstance().getStats(uid).enqueue(new Callback<StatsModel>() {
            @Override
            public void onResponse(Call<StatsModel> call, Response<StatsModel> response) {
                stats.onNext(response.body());
            }
            @Override
            public void onFailure(Call<StatsModel> call, Throwable t) {
            }
        });
    }


    public Observable<StatsModel> getStats(String uid) {
        updateStats(uid);
        return stats;
    }
}