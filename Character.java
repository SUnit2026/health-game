package com.example.healthgame.model;

public class Character {

    private int level;
    private int exp;
    private int state;
    private String title;

    public Character() {
        level = 1;
        exp = 0;
        state = 0;
        title = "초보자";
    }

    public int getLevel() { return level; }
    public int getExp() { return exp; }
    public int getState() { return state; }
    public String getTitle() { return title; }

    public void setExp(int exp) { this.exp = exp; }
    public void setState(int state) { this.state = state; }
    public void setTitle(String title) { this.title = title; }
}