package com.wxj011.t002;

public class Person {
    double salary;
    String birthdayMonth;

    public Person() {
    }

    public Person(double salary, String birthdayMonth) {
        this.salary = salary;
        this.birthdayMonth = birthdayMonth;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getBirthdayMonth() {
        return birthdayMonth;
    }

    public void setBirthdayMonth(String birthdayMonth) {
        this.birthdayMonth = birthdayMonth;
    }

    public void birthdaySalary() {
        if (birthdayMonth.equalsIgnoreCase("october"))
        salary = salary + 500;
    }
}
