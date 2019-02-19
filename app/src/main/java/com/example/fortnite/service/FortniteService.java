package com.example.fortnite.service;




import com.example.fortnite.model.ShopItem;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface FortniteService {



    @GET("store/get")
    Call<ShopItem> getShop(@Query("language") String address);
}
