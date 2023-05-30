package com.example.lab2_pt;

public class Dish {
    private String dishName;
    private Thumbnail thumbnail;
    private boolean promotion;

    public Dish() {
    }

    public Dish(String dishName, Thumbnail thumbnail, boolean promotion) {
        this.dishName = dishName;
        this.thumbnail = thumbnail;
        this.promotion = promotion;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public Thumbnail getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(Thumbnail thumbnail) {
        this.thumbnail = thumbnail;
    }

    public boolean isPromotion() {
        return promotion;
    }

    public void setPromotion(boolean promotion) {
        this.promotion = promotion;
    }
}