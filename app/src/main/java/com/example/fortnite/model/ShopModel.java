package com.example.fortnite.model;


/**
* Выдает ошибку Cannot figure out how to save this field into database. You can consider adding a type converter for it.
* в строчках
*   private Object youtube;
*   private Item_ item;
*   private Ratings ratings;
*/




import com.google.gson.Gson;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;

import org.jetbrains.annotations.NotNull;

import java.lang.reflect.Type;
import java.util.Collections;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverter;
import androidx.room.TypeConverters;

public class ShopModel {

    @SerializedName("date_layout")
    @Expose
    private String dateLayout;
    @SerializedName("lastupdate")
    @Expose
    private Integer lastupdate;
    @SerializedName("language")
    @Expose
    private String language;
    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("rows")
    @Expose
    private Integer rows;
    @SerializedName("vbucks")
    @Expose
    private String vbucks;



    @SerializedName("items")
    @Expose
    private List<Item> items = null;

    public List<Item> getItems() {
        return items;
    }

    public String getDateLayout() {
        return dateLayout;
    }

    public void setDateLayout(String dateLayout) {
        this.dateLayout = dateLayout;
    }

    public Integer getLastupdate() {
        return lastupdate;
    }

    public void setLastupdate(Integer lastupdate) {
        this.lastupdate = lastupdate;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }

    public String getVbucks() {
        return vbucks;
    }

    public void setVbucks(String vbucks) {
        this.vbucks = vbucks;
    }


    public void setItems(List<Item> items) {
        this.items = items;
    }









    @Entity(tableName = "tx")
    public class Item {

        @NonNull @PrimaryKey
        @SerializedName("itemid") @Expose
        private String itemid;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("cost")
        @Expose
        private String cost;
        @SerializedName("featured")
        @Expose
        private Integer featured;
        @SerializedName("refundable")
        @Expose
        private Integer refundable;
        @SerializedName("lastupdate")
        @Expose
        private Integer lastupdate;
//        @SerializedName("youtube")
//        @Expose
//        private Object youtube;

        @SerializedName("item")
        @Expose
        @TypeConverters(DateConverter.class)
        private Item_ item;
//        @SerializedName("ratings")
//        @Expose
//        private Ratings ratings;

        public String getItemid() {
            return itemid;
        }

        public void setItemid(@NotNull String itemid) {
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

        public Integer getFeatured() {
            return featured;
        }

        public void setFeatured(Integer featured) {
            this.featured = featured;
        }

        public Integer getRefundable() {
            return refundable;
        }

        public void setRefundable(Integer refundable) {
            this.refundable = refundable;
        }

        public Integer getLastupdate() {
            return lastupdate;
        }

        public void setLastupdate(Integer lastupdate) {
            this.lastupdate = lastupdate;
        }

//        public Object getYoutube() {
//            return youtube;
//        }
//
//        public void setYoutube(Object youtube) {
//            this.youtube = youtube;
//        }

        public Item_ getItem() {
            return item;
        }

        public void setItem(Item_ item) {
            this.item = item;
        }

//        public Ratings getRatings() {
//            return ratings;
//        }
//
//        public void setRatings(Ratings ratings) {
//            this.ratings = ratings;
//        }

        public class Item_ {

            @SerializedName("image")
            @Expose
            private String image;
            @SerializedName("images")
            @Expose
            private Images images;
            @SerializedName("captial")
            @Expose
            private String captial;
            @SerializedName("type")
            @Expose
            private String type;
            @SerializedName("rarity")
            @Expose
            private String rarity;
            @SerializedName("obtained_type")
            @Expose
            private String obtainedType;

            public String getImage() {
                return image;
            }

            public void setImage(String image) {
                this.image = image;
            }

            public Images getImages() {
                return images;
            }

            public void setImages(Images images) {
                this.images = images;
            }

            public String getCaptial() {
                return captial;
            }

            public void setCaptial(String captial) {
                this.captial = captial;
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

            public String getObtainedType() {
                return obtainedType;
            }

            public void setObtainedType(String obtainedType) {
                this.obtainedType = obtainedType;
            }


            public class Images {

                @SerializedName("transparent")
                @Expose
                private String transparent;
                @SerializedName("background")
                @Expose
                private String background;
                @SerializedName("information")
                @Expose
                private String information;
                @SerializedName("featured")
                @Expose
                private Featured featured;

                public String getTransparent() {
                    return transparent;
                }

                public void setTransparent(String transparent) {
                    this.transparent = transparent;
                }

                public String getBackground() {
                    return background;
                }

                public void setBackground(String background) {
                    this.background = background;
                }

                public String getInformation() {
                    return information;
                }

                public void setInformation(String information) {
                    this.information = information;
                }

                public Featured getFeatured() {
                    return featured;
                }

                public void setFeatured(Featured featured) {
                    this.featured = featured;
                }

            }


            public class Featured {

                @SerializedName("transparent")
                @Expose
                private String transparent;

                public String getTransparent() {
                    return transparent;
                }

                public void setTransparent(String transparent) {
                    this.transparent = transparent;
                }

            }
        }
    }



    public class DateConverter {

        @TypeConverter
        public List<Item.Item_> toCountryLangList(String countryLangString) {
            if (countryLangString == null) {
                return (null);
            }
            Gson gson = new Gson();
            Type type = new TypeToken<List<Item.Item_>>() {}.getType();
            List<Item.Item_> countryLangList = gson.fromJson(countryLangString, type);
            return countryLangList;
        }
    }


    public class Ratings {

        @SerializedName("avgStars")
        @Expose
        private Double avgStars;
        @SerializedName("totalPoints")
        @Expose
        private Integer totalPoints;
        @SerializedName("numberVotes")
        @Expose
        private Integer numberVotes;

        public Double getAvgStars() {
            return avgStars;
        }

        public void setAvgStars(Double avgStars) {
            this.avgStars = avgStars;
        }

        public Integer getTotalPoints() {
            return totalPoints;
        }

        public void setTotalPoints(Integer totalPoints) {
            this.totalPoints = totalPoints;
        }

        public Integer getNumberVotes() {
            return numberVotes;
        }

        public void setNumberVotes(Integer numberVotes) {
            this.numberVotes = numberVotes;
        }

    }
}




