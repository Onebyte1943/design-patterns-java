package com.yang.learn.prototype;

/**
 * @author yangqk
 */
public class ConcretePrototypeA implements Iprototype<ConcretePrototypeA> {

    private String desc;

    public ConcretePrototypeA(String desc) {
        this.desc = desc;
    }

    @Override
    public ConcretePrototypeA clone() {
        return new ConcretePrototypeA(this.desc);
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "ConcretePrototypeA{" +
                "desc='" + desc + '\'' +
                '}';
    }
}
