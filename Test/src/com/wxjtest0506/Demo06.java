package com.wxjtest0506;

import java.io.*;
import java.util.Set;
import java.util.TreeMap;

public class Demo06 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("D:\\IdeaProject\\JavaSE\\Test\\src\\com\\wxjtest0506\\article.txt"));

        String line;
        String s = null;

        while ((line = br.readLine()) != null) {
            s = line;
        }
        TreeMap<Character, Integer> tm = new TreeMap<>();
        for (int i = 0; i < s.length(); i++) {
            char key = s.charAt(i);
            if (key >= 'A' && key <= 'z') {
                Integer value = tm.get(key);
                if (value == null) {
                    tm.put(key, 1);
                } else {
                    value++;
                    tm.put(key, value);
                }
            }
        }
        StringBuffer sb = new StringBuffer();
        String result = null;
        Set<Character> characters = tm.keySet();
        for (Character character : characters) {
            Integer integer = tm.get(character);

            sb.append(character).append("(").append(integer).append(
                    ")").append(",");
            result = sb.toString();
        }
        result=result.substring(0,result.length()-1);
        System.out.println(result);
    }
}

