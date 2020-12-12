package com.yang.learn.singleton;

/**
 * 使用synchronized,同步getInstance方法，所以是线程安全的
 * 但是synchronized这里同步代码块的范围较大，可以优化其同步的范围
 */
public class LazySyncSingleton {
    private LazySyncSingleton() {
    }

    private static LazySyncSingleton instance = null;

    public synchronized static LazySyncSingleton getInstance() {
        if (instance == null) {
            instance = new LazySyncSingleton();
        }
        return instance;
    }
}
