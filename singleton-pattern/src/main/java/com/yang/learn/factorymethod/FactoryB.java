package com.yang.learn.factorymethod;

/**
 * @author yang
 */
public class FactoryB implements Ifactory{

    @Override
    public Iproduct createProduct() {
        return new ConcreteProductB();
    }
}
