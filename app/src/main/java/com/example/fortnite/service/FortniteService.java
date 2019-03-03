package com.example.fortnite.service;




import com.example.fortnite.model.PsStatsModel;
import com.example.fortnite.model.ShopModel;
import com.example.fortnite.model.PcStatsModel;
import com.example.fortnite.model.XboxStatsModel;
import com.example.fortnite.model.idModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface FortniteService {



    @GET("store/get")
    Call<ShopModel> getShop(@Query("language") String language);

    @GET("users/id")
    Call<idModel> getID(@Query("username") String username);


    @GET("users/public/br_stats_v2")
    Call<PcStatsModel> getPcStats(@Query("user_id") String user_id, @Query("platform") String platform);

    @GET("users/public/br_stats_v2")
    Call<PsStatsModel> getPsStats(@Query("user_id") String user_id, @Query("platform") String platform);

    @GET("users/public/br_stats_v2")
    Call<XboxStatsModel> getXboxStats(@Query("user_id") String user_id, @Query("platform") String platform);
}
