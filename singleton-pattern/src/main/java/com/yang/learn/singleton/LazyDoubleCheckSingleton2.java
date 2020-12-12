package com.yang.learn.singleton;

/**
 * 这里我们进一步缩小synchronized同步代码块的范围
 * 但是这就带来了新的问题：我们不再能保证只创建一个对象，可能因并发原因而产生多个对象；
 * 如果两个线程在同一时间都执行到了if (instance == null) 并且都满足，则接下来的代码是肯定要执行两次
 */
public class LazyDoubleCheckSingleton2 {
    private volatile static LazyDoubleCheckSingleton2 instance;
    private LazyDoubleCheckSingleton2(){}

    public static LazyDoubleCheckSingleton2 getInstance() {
        if (instance == null) {
            synchronized (LazyDoubleCheckSingleton2.class) {
                instance = new LazyDoubleCheckSingleton2();
            }
        }
        return instance;
    }
}
