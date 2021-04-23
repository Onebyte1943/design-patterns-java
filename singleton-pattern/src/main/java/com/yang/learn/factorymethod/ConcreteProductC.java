package com.yang.learn.factorymethod;

/**
 * @author yang
 */
public class ConcreteProductC implements Iproduct {

    @Override
    public void create() {
        System.out.println("ConcreteProductC");
    }
}
