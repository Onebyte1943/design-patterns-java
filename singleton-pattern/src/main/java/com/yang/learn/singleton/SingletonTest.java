package com.yang.learn.singleton;

public class SingletonTest {

    public static void main(String[] args) {
        Thread t1 = new Thread(new ExecutorThread());
        Thread t2 = new Thread(new ExecutorThread());

        t1.start();
        t2.start();
        System.out.println("End");
    }


    /**
     * 创建一个线程类，用于模拟多线程环境
     */
    public static class ExecutorThread implements Runnable {
        public void run() {
            // LazySimpleSingleton lazySimpleSingleton = LazySimpleSingleton.getInstance();
            LazySyncSingleton lazySyncSingleton = LazySyncSingleton.getInstance();
            System.out.println(Thread.currentThread().getName() + ": " + lazySyncSingleton);
        }
    }
}
