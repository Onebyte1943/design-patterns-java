package com.yang.learn.simplefactory;

/**
 * @author yang
 */
public class ConcreteProductB implements Iproduct{

    @Override
    public void create() {
        System.out.println("ConcreteProductB");
    }
}
