package com.yang.learn.singleton;

/**
 * 饿汉式的静态代码块写法
 */
public class HungryStaticSingleton {
    private static final HungryStaticSingleton instance;

    static {
        instance = new HungryStaticSingleton();
    }

    private HungryStaticSingleton() {
    }
    public static HungryStaticSingleton getInstance() {
        return instance;
    }
}
