package com.yang.learn.simplefactory;

/**
 * @author yang
 */
public class ConcreteProductA implements Iproduct{

    @Override
    public void create() {
        System.out.println("ConcreteProductA");
    }
}
