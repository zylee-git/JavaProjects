package com.test.oop7_interfaceDemo;

public class Rabbit extends Animal {
    public Rabbit() {
    }

    public Rabbit(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("兔子吃胡萝卜");
    }
}
