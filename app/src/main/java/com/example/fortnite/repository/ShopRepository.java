package com.example.fortnite.repository;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.AsyncTask;

import com.example.fortnite.Executor;
import com.example.fortnite.database.ShopDao;
import com.example.fortnite.database.ShopDatabase;
import com.example.fortnite.model.ShopModel;
import com.example.fortnite.service.FortniteService;
import com.example.fortnite.service.Service;

import java.util.List;

import androidx.room.Room;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subjects.BehaviorSubject;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ShopRepository {

    private static ShopRepository sInstance;

    private ShopDao mShopDao;
    private BehaviorSubject<List<ShopModel.Item>> items = BehaviorSubject.create();

    private static class InstanceHolder {
        static final ShopRepository sInstance = new ShopRepository();
    }

    private ShopRepository() { }

    public static ShopRepository getInstance() {
        return InstanceHolder.sInstance;
    }



    private void updateTransactions() {
        Service.getInstance().getShop("en")
                .enqueue(new retrofit2.Callback<ShopModel>() {
                    @Override
                    public void onResponse(Call<ShopModel> call, Response<ShopModel> response) {
                        if (response.isSuccessful()) { // если запрос успешен
                            items.onNext(response.body().getItems());
                            saveTransactions(response.body().getItems());
                        } else {}
                    }

                    @Override
                    public void onFailure(Call<ShopModel> call, Throwable t) {}
                });
    }

    public Observable<List<ShopModel.Item>> getTransactions() {
        updateTransactions();
        return items;
    }


    public void initialize(Context context) {
        mShopDao = Room.databaseBuilder(context.getApplicationContext(), ShopDatabase.class, "database").build().getShopDao();
        loadTransactions();
    }


    public void loadTransactions() {
        Executor.EXECUTOR.execute(() -> items.onNext(mShopDao.getAll()));
//        new AsyncTask<String, Integer, Void>() {
//
//            @Override
//            protected Void doInBackground(String... strings) {
//                transactions.onNext(mTransactionDao.getAll());
//                return null;
//            }
//        };


    }


    public void saveTransactions(List<ShopModel.Item> itemlist) {
        Single.fromCallable(() -> {
            mShopDao.deleteAll();
            mShopDao.insert(itemlist);
            return true;
        }).subscribeOn(Schedulers.io()).subscribe();

//        new AsyncTask<String, Integer, Void>() {
//            @Override
//            protected Void doInBackground(String... strings) {
//                mTransactionDao.deleteAll();
//                mTransactionDao.insert(transactions);
//                return null;
//            }
//        };

    }
}