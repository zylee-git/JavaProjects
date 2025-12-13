package com.test.oop5_finalDemo;

public class finalClassDemo {
    static void main() {
        // final 修饰类代表最终类，不能被继承
    }
}

final class finalBase {
    public final void show() {
        System.out.print("Base");
    }
}

class finalDerived {  // 不能使用 extend finalBase 继承final修饰的类

}


