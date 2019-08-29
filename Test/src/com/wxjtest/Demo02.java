package com.wxjtest;

import java.util.*;

public class Demo02 {
    public static void main(String[] args) {
        String red = "红";
        String blue = "蓝";
        HashSet<Integer> hs = new HashSet<>();
        ArrayList<Object> objects = new ArrayList<>();
        while (hs.size()<6) {
            int redNum = new Random().nextInt(33) + 1;
            hs.add(redNum);
        }
        for (Integer h : hs) {
            objects.add(red+" "+h);
        }
        int blueNum = new Random().nextInt(16) + 1;
        objects.add(blue+" "+blueNum);
        for (Object object : objects) {
            System.out.println(object);
        }

    }
}
