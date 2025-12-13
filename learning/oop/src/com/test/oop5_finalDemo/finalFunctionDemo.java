package com.test.oop5_finalDemo;

public class finalFunctionDemo {
    static void main() {
        // final 修饰方法代表最终方法，不允许子类重写
    }
}

class Base {
    public final void show() {
        System.out.print("Base");
    }
}

class Derived {
    // @Override  // final方法不能重写
    public void show() {
        System.out.print("Derived");
    }
}
