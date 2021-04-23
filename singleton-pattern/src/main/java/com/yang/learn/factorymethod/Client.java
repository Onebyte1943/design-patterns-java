package com.yang.learn.factorymethod;

/**
 * @author yang
 */
public class Client {

    public static void main(String[] args) {
        FactoryA factoryA = new FactoryA();
        factoryA.createProduct().create();

        FactoryB factoryB = new FactoryB();
        factoryB.createProduct().create();
    }
}
