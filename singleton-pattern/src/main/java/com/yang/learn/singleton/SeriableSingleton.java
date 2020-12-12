package com.yang.learn.singleton;

import java.io.Serializable;

/**
 * 实际上就是饿汉式，用于序列化和反序列化测试
 */
public class SeriableSingleton implements Serializable {

    private static final SeriableSingleton instance = new SeriableSingleton();

    private SeriableSingleton() {
    }

    public static SeriableSingleton getInstance() {
        return instance;
    }

    private Object readResolve() {
        return instance;
    }
}
