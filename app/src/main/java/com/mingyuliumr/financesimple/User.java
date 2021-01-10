package com.mingyuliumr.financesimple;

public class User {
    private String name;
    private int numTree;
    private int numChall;
    private double moneyFromLesson;
    private double moneyFromMarket;

    public User(String name) {
        this.name = name;
        numTree = 0;
        numChall = 0;
        moneyFromLesson = 0;
        moneyFromMarket = 0;
    }

    public String getName() {
        return name;
    }

    public int getNumTree() {
        return numTree;
    }

    public int getNumChall() {
        return numChall;
    }

    public double getMoneyL() {
        return moneyFromLesson;
    }

    public double getMoneyM() {
        return moneyFromMarket;
    }

    public double getTotalMoney() {
        return moneyFromLesson + moneyFromMarket;
    }

    public void earnFromLesson(double m) {
        moneyFromLesson += m;
    }

    public void earnFromMarket(double m) {
        moneyFromMarket += m;
    }

}
