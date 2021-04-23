package com.yang.learn.simplefactory;

/**
 * @author yuntai
 */
public class SimpleFactory {

    public static Iproduct createProduct(String type) {
        switch (type) {
            case TypeConst.TYPE_A:
                return new ConcreteProductA();
            case TypeConst.TYPE_B:
                return new ConcreteProductB();
            case TypeConst.TYPE_C:
                return new ConcreteProductC();
            default:
                return null;
        }
    }
}
