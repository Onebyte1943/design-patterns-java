package com.yang.learn.factorymethod;

/**
 * @author yang
 */
public class ConcreteProductB implements Iproduct {

    @Override
    public void create() {
        System.out.println("ConcreteProductB");
    }
}
