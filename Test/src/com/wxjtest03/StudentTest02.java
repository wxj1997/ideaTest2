package com.wxjtest03;

import java.util.Comparator;
import java.util.TreeSet;

public class StudentTest02 {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int num =(int) (o2.getScore() - o1.getScore());
                int num1=num==0?o1.getAge()-o2.getAge():num;
                return num1;
            }
        });
        Student s1 = new Student("liusan", 20, 90);
        Student s2 = new Student("lisi", 22, 90);
        Student s3 = new Student("wangwu", 20, 99);
        Student s4 = new Student("sunliu", 22, 100);
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        for (Student s : ts) {
            System.out.println(s);
        }
    }
}
