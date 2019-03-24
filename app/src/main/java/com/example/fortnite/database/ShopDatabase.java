package com.example.fortnite.database;

import com.example.fortnite.model.ShopModel;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

@Database(entities = ShopModel.Item.class, version = 1, exportSchema = false)
@TypeConverters({ShopModel.ItemConverter.class})
public abstract class ShopDatabase extends RoomDatabase {
    public abstract ShopDao getShopDao();
}
