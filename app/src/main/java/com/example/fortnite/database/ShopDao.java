package com.example.fortnite.database;

import com.example.fortnite.model.ShopModel;

import java.util.ArrayList;
import java.util.List;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

@Dao
public interface ShopDao {


    @Insert
    void insert(ArrayList<ShopModel.Item> transactions);

    @Query("SELECT * FROM tx")
    ArrayList<ShopModel.Item> getAll();

//    @Query("SELECT * FROM tx WHERE itemid = :id")
//    List<ShopModel.Item> getByHash(String id);

    @Delete
    void delete(ShopModel.Item transaction);

    @Query("DELETE FROM tx")
    void deleteAll();
}
