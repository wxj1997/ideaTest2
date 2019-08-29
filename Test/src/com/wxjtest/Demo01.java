package com.wxjtest;

import java.util.ArrayList;
import java.util.Random;

public class Demo01 {
    public static void main(String[] args) {
        int[] ints = new int[10];
        ArrayList<Integer> arr = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            ints[i] = random.nextInt(100) + 1;
        }
        for (int anInt : ints) {
            System.out.print(anInt+" ");
        }
        System.out.println();
        System.out.println("******************");
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] > 10) {
                arr.add(ints[i]);
            }
        }
        for (Integer integer : arr) {
            System.out.print(integer+" ");
        }
    }
}
