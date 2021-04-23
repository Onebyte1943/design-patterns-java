package com.yang.learn.factorymethod;

/**
 * @author yang
 */
public class ConcreteProductA implements Iproduct {

    @Override
    public void create() {
        System.out.println("ConcreteProductA");
    }
}
