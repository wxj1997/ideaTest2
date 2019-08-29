package com.wxj011.t001;

public class MainApp {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("t001", "薛之谦", "男", 26, "Java");
        Teacher t2 = new Teacher("t002", "张碧晨", "女", 24, "IOS");
        Teacher t3 = new Teacher("t003", "张杰", "男", 28, "Java");

        Course course1 = new Course("s001", "Java", "2007-02-08", "Java学科，包含JavaSE和JavaEE");
        Course course2 = new Course("s002", "Java", "2007-02-09", "IOS系统开发");

        System.out.println(t1.toString());
        System.out.println(t2.toString());
        System.out.println(t3.toString());
        System.out.println("****************************");
        System.out.println(course1.toString());
        System.out.println(course2.toString());


    }
}
