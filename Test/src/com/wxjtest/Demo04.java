package com.wxjtest;

import java.util.HashMap;
import java.util.Set;

public class Demo04 {
    public static void main(String[] args) {
        String[] str1={"黑龙江省","浙江省","江西省","广东省","福建省"};
        String[] str2={"哈尔滨","杭州","南昌","广州","福州"};
        HashMap<String, String> hm = new HashMap<>();
        for (int i=0;i<str1.length;i++){
            hm.put(str1[i],str2[i]);
        }
        System.out.println(hm);
    }
}
