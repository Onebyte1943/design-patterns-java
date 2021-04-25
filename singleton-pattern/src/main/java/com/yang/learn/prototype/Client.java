package com.yang.learn.prototype;

/**
 * @author yangqk
 */
public class Client {

    public static void main(String[] args) {
        // create
        ConcretePrototypeA concretePrototypeA = new ConcretePrototypeA("originalA");
        System.out.println(concretePrototypeA);

        // copy prototype
        ConcretePrototypeA cloneA = concretePrototypeA.clone();
        cloneA.setDesc("cloneA");
        System.out.println(cloneA);
        System.out.println(concretePrototypeA == cloneA);

        System.out.println("---------------------------------------------------------------");

        // create
        ConcretePrototypeB concretePrototypeB = new ConcretePrototypeB("originalB");
        System.out.println(concretePrototypeB);

        // copy prototype
        ConcretePrototypeB cloneB = concretePrototypeB.clone();
        System.out.println(cloneB);
    }
}
