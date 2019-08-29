package com.wxj011.t004;

public class Boy extends Person {
    private String food;

    public Boy(String name, String gender, int age, String food) {
        super(name, gender, age);
        this.food = food;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    @Override
    public void eat() {
        System.out.println(name+"今年是一个"+age+"岁的"+gender+"孩子，正在吃"+food+"。");
    }
}
