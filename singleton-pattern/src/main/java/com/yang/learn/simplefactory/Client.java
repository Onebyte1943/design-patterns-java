package com.yang.learn.simplefactory;

/**
 * @author yang
 */
public class Client {

    public static void main(String[] args) {
//        SimpleFactory.createProduct(TypeConst.TYPE_A).create();
//        SimpleFactory.createProduct(TypeConst.TYPE_B).create();
//        SimpleFactory.createProduct(TypeConst.TYPE_C).create();

        SimpleFactoryOptimization.createProduct(ConcreteProductA.class).create();
    }
}
