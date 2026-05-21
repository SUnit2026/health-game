package com.example.healthgame.model;

public class UserRecord {
    private String date;
    private int foodCalories;
    private int exerciseCalories;
    private int netCalories;
    private String rating;

    public UserRecord(String date,int foodCalories,int exerciseCalories,int netCalories,String rating) {
        this.date = date;
        this.foodCalories = foodCalories;
        this.exerciseCalories = exerciseCalories;
        this.netCalories = netCalories;
        this.rating = rating;
    }

    public String getDate() { return date; }
    public int getNetCalories() { return netCalories; }
    public String getRating() { return rating; }
}