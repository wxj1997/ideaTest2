package com.wxjtest0506;

import java.io.*;

public class Demo05 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("D:\\IdeaProject\\JavaSE\\Test\\src\\com\\wxjtest0506\\article.txt"));

        String line;
        String s = null;
        int count=0;
        while ((line=br.readLine())!=null){
            s=line;
        }
        for (int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if (c=='A'||c=='a'){
                count++;
            }
        }
        System.out.println(count);
    }
}

