package com.yang.learn.singleton;

/**
 * 延迟加载，但是线程不安全
 */
public class LazySimpleSingleton {
    private LazySimpleSingleton() {
    }

    private static LazySimpleSingleton instance = null;

    public static LazySimpleSingleton getInstance() {
        if (instance == null) {
            instance = new LazySimpleSingleton();
        }
        return instance;
    }
}
