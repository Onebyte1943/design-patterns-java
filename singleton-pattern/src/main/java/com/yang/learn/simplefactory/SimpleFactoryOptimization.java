package com.yang.learn.simplefactory;

/**
 * @author yang
 */
public class SimpleFactoryOptimization {

    public static Iproduct createProduct(Class<? extends Iproduct> clazz) {
        if (clazz != null) {
            try {
                return clazz.newInstance();
            } catch (InstantiationException | IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
