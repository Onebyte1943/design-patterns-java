package com.yang.learn.singleton;

/**
 * 这里我们将synchronized挪到方法内，但是同步的代码块范围依然和LazySyncSingleton一致，虽然是线程安全的
 * 但是并没有解决问题
 */
public class LazyDoubleCheckSingleton {
    private volatile static LazyDoubleCheckSingleton instance;
    private LazyDoubleCheckSingleton(){}

    public static LazyDoubleCheckSingleton getInstance() {
        synchronized (LazyDoubleCheckSingleton.class) {
            if (instance == null) {
                instance = new LazyDoubleCheckSingleton();
            }
        }
        return instance;
    }
}
