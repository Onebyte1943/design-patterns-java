package com.yang.learn.singleton;

public enum EnumSingleton {

    INSTANCE;

    // 枚举的属性
    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }
}
