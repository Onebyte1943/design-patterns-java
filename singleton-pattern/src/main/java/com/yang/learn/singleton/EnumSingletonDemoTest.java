package com.yang.learn.singleton;

public class EnumSingletonDemoTest {

    public static void main(String[] args) {

        MyThread thread = new MyThread();
        MyThread thread2 = new MyThread();
        MyThread thread3 = new MyThread();

        thread.start();
        thread2.start();
        thread3.start();
    }
}
