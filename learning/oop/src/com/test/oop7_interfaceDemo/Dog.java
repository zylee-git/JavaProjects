package com.test.oop7_interfaceDemo;

public class Dog extends Animal implements Swim {
    public Dog() {
    }

    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    @Override
    public void swim() {
        System.out.println("狗在狗刨");
    }
}
