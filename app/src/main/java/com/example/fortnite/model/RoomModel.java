package com.example.fortnite.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

public class RoomModel {

    private List<Item> items;

    public List<Item> getItems() {
        return items;
    }



    @Entity(tableName = "tx")
    public static class Item{

        @PrimaryKey @NonNull
        private String itemid;

        private String name;

        private String cost;

        private String image;

        private String type;

        private String rarity;


        public String getItemid() {
            return itemid;
        }
        public void setItemid(String itemid) {
            this.itemid = itemid;
        }

        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }

        public String getCost() {
            return cost;
        }
        public void setCost(String cost) {
            this.cost = cost;
        }

        public String getImage() {
            return image;
        }
        public void setImage(String image) {
            this.image = image;
        }

        public String getType() {
            return type;
        }
        public void setType(String type) {
            this.type = type;
        }

        public String getRarity() {
            return rarity;
        }
        public void setRarity(String rarity) {
            this.rarity = rarity;
        }

    }
}
