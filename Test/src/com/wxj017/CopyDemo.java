package com.wxj017;


public class CopyDemo {
    public static void main(String[] args) {

        //static ClassLoader getSystemClassLoader()：返回用于委派的系统类加载器
        ClassLoader c = ClassLoader.getSystemClassLoader();
        System.out.println(c); //AppClassLoader

        //ClassLoader getParent()：返回父类加载器进行委派
        ClassLoader c2 = c.getParent();
        System.out.println(c2); //PlatformClassLoader

        ClassLoader c3 = c2.getParent();
        System.out.println(c3); //null


    }

}
