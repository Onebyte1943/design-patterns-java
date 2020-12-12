package com.yang.learn.singleton;

/**
 * 这就是DCL双重检查机制，其是线程安全的
 */
public class LazyDoubleCheckSingleton3 {
    private volatile static LazyDoubleCheckSingleton3 instance;
    private LazyDoubleCheckSingleton3(){}

    public static LazyDoubleCheckSingleton3 getInstance() {
        // 第一个判断是否要等待获取锁，如果对象已经存在，则直接返回，大大提高了因获取锁带来的性能消耗
        if (instance == null) {
            synchronized (LazyDoubleCheckSingleton3.class) {
                // 防止并发问题
                if (instance == null) {
                    instance = new LazyDoubleCheckSingleton3();
                }
            }
        }
        return instance;
    }
}
