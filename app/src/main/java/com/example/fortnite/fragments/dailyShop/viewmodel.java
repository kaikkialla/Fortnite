package com.example.fortnite.fragments.dailyShop;

import com.example.fortnite.model.RoomModel;
import com.example.fortnite.repository.ShopRepository;

import java.util.ArrayList;
import java.util.List;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import io.reactivex.disposables.Disposable;

public class viewmodel extends ViewModel {
    private MutableLiveData<List<RoomModel.Item>> items = new MutableLiveData<>();
    private String query;
    private Disposable mDisposable;


    LiveData<List<RoomModel.Item>> getTransactions(String query) {
        this.query = query; // сохраняем поисковый запрос (чтобы потом отфильтровать)
        subscribeTransactions(query); // подписываем на транзакции (если ещё не)
        return items;
    }

    private void subscribeTransactions(String query) {
        if (mDisposable != null) { // если уже подписались
            mDisposable.dispose(); // отписываемся
        }
        // переподписываемся на все транзакции
        mDisposable = ShopRepository.getInstance().getTransactions()
                .subscribe(transactions -> {
                    // когда они приходят, фильтруем
                    final List<RoomModel.Item> filteredTransactions = new ArrayList<>();
                    for (RoomModel.Item transaction : transactions) {
                        if (transaction.getName().contains(query)) {
                            filteredTransactions.add(transaction);
                        }
                    }
                    // и кладём в контейнер
                    this.items.setValue(filteredTransactions);
                });
    }
}