package com.yang.learn.singleton;

/**
 * 静态内部类实现单例
 * 这种写法由JVM的类加载机制保证实例的线程安全，以及延迟加载的特性；而且避免了synchronized带来的性能消耗
 */
public class LazyStaticInnerClassSingleton {
    private LazyStaticInnerClassSingleton(){}

    public static LazyStaticInnerClassSingleton getInstance() {
        return LazySingletonHolder.instance;
    }

    private static class LazySingletonHolder {
        private static final LazyStaticInnerClassSingleton instance = new LazyStaticInnerClassSingleton();
    }
}
