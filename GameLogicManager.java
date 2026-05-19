package com.example.healthgame.logic;

public class GameLogicManager {
    public int calculateNetCalories(int food, int exercise) { return food - exercise; }

    public int updateCharacterState(int netCalories) {
        if(netCalories <= 0) return 3;
        else if(netCalories <= 300) return 2;
        else if(netCalories <= 700) return 1;
        else return 0;
    }

    public String calculateDailyRating(int netCalories){
        if(netCalories <= 0) return "S";
        else if(netCalories <= 300) return "A";
        else if(netCalories <= 700) return "B";
        else return "C";
    }

    public int updateStreak(int currentStreak, boolean todaySuccess){
        if(todaySuccess) return currentStreak + 1;
        return 0;
    }

    public String updateTitle(int streak){
        if(streak >= 100) return "전설";
        else if(streak >= 30) return "마스터";
        else if(streak >= 7) return "꾸준한 자";
        else return "초보자";
    }

    public int calculateExp(int exerciseCalories){
        return exerciseCalories / 10;
    }
}