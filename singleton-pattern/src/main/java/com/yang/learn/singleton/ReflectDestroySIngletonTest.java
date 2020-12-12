package com.yang.learn.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 反射对单例模式的破坏，显然饿汉式和懒汉式在这种场景下并不能保证其安全性
 */
public class ReflectDestroySIngletonTest {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //Class<?> clazz = LazyStaticInnerClassSingleton.class;
        Class<?> clazz = LazyStaticInnerClassReflectSingleton.class;

        // 获取私有构造方法
        Constructor<?> constructor = clazz.getDeclaredConstructor(null);
        // 强制访问
        constructor.setAccessible(true);

        // 创建两个实例
        Object instance = constructor.newInstance(null);
        Object instance2 = constructor.newInstance(null);

        // false
        System.out.println(instance == instance2);
    }
}
