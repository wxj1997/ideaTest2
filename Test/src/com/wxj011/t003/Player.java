package com.wxj011.t003;

public class Player implements Fight {
    private String name;
    private int Level;
    private double power;

    public Player() {
    }

    public Player(String name, int level, double power) {
        this.name = name;
        Level = level;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return Level;
    }

    public void setLevel(int level) {
        Level = level;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", Level=" + Level +
                ", power=" + power +
                '}';
    }

    @Override
    public void DaGuai() {
        System.out.println(name+"正在打怪");
    }
}
