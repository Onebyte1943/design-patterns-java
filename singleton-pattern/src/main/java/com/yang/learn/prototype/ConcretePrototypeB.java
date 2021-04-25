package com.yang.learn.prototype;

/**
 * @author yangqk
 */
public class ConcretePrototypeB implements Iprototype<ConcretePrototypeB> {

    private String desc;

    public ConcretePrototypeB(String desc) {
        this.desc = desc;
    }

    @Override
    public ConcretePrototypeB clone() {
        return new ConcretePrototypeB(this.desc);
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "ConcretePrototypeB{" +
                "desc='" + desc + '\'' +
                '}';
    }
}
