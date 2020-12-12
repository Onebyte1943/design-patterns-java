package com.yang.learn.singleton;

/**
 * 静态内部类实现单例
 * 这种写法由JVM的类加载机制保证实例的线程安全，以及延迟加载的特性；而且避免了synchronized带来的性能消耗
 * 为了避免反射带来的安全问题，我们稍加优化构造方法
 */
public class LazyStaticInnerClassReflectSingleton {
    private LazyStaticInnerClassReflectSingleton(){
        if (LazySingletonHolder.instance != null) {
            throw new RuntimeException("不允许创建多个实例");
        }
    }

    public static LazyStaticInnerClassReflectSingleton getInstance() {
        return LazySingletonHolder.instance;
    }

    private static class LazySingletonHolder {
        private static final LazyStaticInnerClassReflectSingleton instance = new LazyStaticInnerClassReflectSingleton();
    }
}
