package com.yang.learn.singleton;

/**
 * 饿汉模式经典写法，简单实用，较为通用
 */
public class HungrySingleton {
    private static final HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {
    }
    public static HungrySingleton getInstance() {
        return instance;
    }
}
