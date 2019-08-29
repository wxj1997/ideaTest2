package com.wxjtest0800;

import java.io.*;
import java.util.Scanner;

public class Demo08 {
    public static void main(String[] args) throws IOException {
        System.out.println("请输入3个字符串作为验证码:");
        BufferedReader br = null;
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\IdeaProject\\JavaSE\\Test\\src\\com\\wxjtest0800\\code.txt"));
        for (int i = 0; i < 3; i++) {
            br = new BufferedReader(new InputStreamReader(System.in));
            bw.write(br.readLine());
            bw.newLine();
            bw.flush();
        }
        br = new BufferedReader(new FileReader("D" +
                ":\\IdeaProject\\JavaSE\\Test\\src\\com\\wxjtest0800\\code.txt"));
        String line;
        String[] strs = new String[3];
        int i = 0;
        while ((line = br.readLine()) != null) {
            strs[i] = line;
            i++;
        }
        br.close();
        bw.close();
        System.out.println("请录入一个需要被校验的验证码:");
        Scanner scanner = new Scanner(System.in);
        for (int j = 0; j < 3; j++) {
            String s = scanner.nextLine();
            if (s.equalsIgnoreCase(strs[0]) || s.equalsIgnoreCase(strs[1]) || s.equalsIgnoreCase(strs[2])) {
                System.out.println("验证成功");
                break;
            } else {
                if (j != 2) {
                    System.out.println("验证失败");
                } else {
                    System.out.println("错误输入已经达到3次，请明天再登陆");
                    break;
                }

            }
        }

    }
}
