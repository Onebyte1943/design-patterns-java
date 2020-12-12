package com.yang.learn.singleton;

import java.io.*;

public class SeriableSingletonTest {

    public static void main(String[] args) {

        // 准备两个对象，singleton1接收从输入流中反序列化的实例
        SeriableSingleton singleton1 = null;
        SeriableSingleton singleton2 = SeriableSingleton.getInstance();

        try {
            // 序列化
            FileOutputStream fos = new FileOutputStream("SeriableSingleton.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(singleton2);
            oos.flush();
            oos.close();

            // 反序列化
            FileInputStream fis = new FileInputStream("SeriableSingleton.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            singleton1 = (SeriableSingleton) ois.readObject();
            ois.close();

            System.out.println(singleton1);
            System.out.println(singleton2);
            // false
            System.out.println(singleton1 == singleton2);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
