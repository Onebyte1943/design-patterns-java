package com.yang.learn.factorymethod;

/**
 * @author yang
 */
public class FactoryC implements Ifactory{

    @Override
    public Iproduct createProduct() {
        return new ConcreteProductC();
    }
}
