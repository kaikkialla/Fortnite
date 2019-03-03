package com.example.fortnite.repository;

import com.example.fortnite.model.PcStatsModel;
import com.example.fortnite.model.PsStatsModel;
import com.example.fortnite.model.XboxStatsModel;
import com.example.fortnite.service.Service;

import io.reactivex.Observable;
import io.reactivex.subjects.BehaviorSubject;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class StatsRepository {


    public static StatsRepository instance;
    BehaviorSubject<PcStatsModel> pcStats = BehaviorSubject.create();
    BehaviorSubject<PsStatsModel> psStats = BehaviorSubject.create();
    BehaviorSubject<XboxStatsModel> xboxStats = BehaviorSubject.create();

    private StatsRepository() {
    }


    public static StatsRepository getInstance() {
        if (instance == null) {
            instance = new StatsRepository();
        }
        return instance;
    }




    public void updatePcStats(String uid, String platform) {
        Service.getInstance().getPcStats(uid, platform).enqueue(new Callback<PcStatsModel>() {
            @Override
            public void onResponse(Call<PcStatsModel> call, Response<PcStatsModel> response) {

                pcStats.onNext(response.body());
            }

            @Override
            public void onFailure(Call<PcStatsModel> call, Throwable t) {

            }
        });
    }


    public Observable<PcStatsModel> getPcStats(String uid, String platform) {
        updatePcStats(uid, platform);
        return pcStats;
    }







    public void updateXboxStats(String uid, String platform) {
        Service.getInstance().getXboxStats(uid, platform).enqueue(new Callback<XboxStatsModel>() {
            @Override
            public void onResponse(Call<XboxStatsModel> call, Response<XboxStatsModel> response) {

                xboxStats.onNext(response.body());
            }

            @Override
            public void onFailure(Call<XboxStatsModel> call, Throwable t) {

            }
        });
    }

    public Observable<XboxStatsModel> getXboxStats(String uid, String platform) {
        updateXboxStats(uid, platform);
        return xboxStats;
    }








    public void updatePsStats(String uid, String platform) {
        Service.getInstance().getPsStats(uid, platform).enqueue(new Callback<PsStatsModel>() {
            @Override
            public void onResponse(Call<PsStatsModel> call, Response<PsStatsModel> response) {

                psStats.onNext(response.body());
            }

            @Override
            public void onFailure(Call<PsStatsModel> call, Throwable t) {

            }
        });
    }

    public Observable<PsStatsModel> getPsStats(String uid, String platform) {
        updatePsStats(uid, platform);
        return psStats;
    }
}


/*
    Переделать updateStats генериком
 */