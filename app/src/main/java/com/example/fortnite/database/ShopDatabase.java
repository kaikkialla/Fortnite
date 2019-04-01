package com.example.fortnite.database;

import com.example.fortnite.model.RoomModel;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = RoomModel.Item.class, version = 1, exportSchema = false)
public abstract class ShopDatabase extends RoomDatabase {
    public abstract ShopDao getShopDao();
}
