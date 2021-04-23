package com.yang.learn.factorymethod;

/**
 * @author yang
 */
public class FactoryA implements Ifactory{

    @Override
    public Iproduct createProduct() {
        return new ConcreteProductA();
    }
}
