package com.test.oop7_interfaceDemo;

public abstract class Animal {
    String name;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public abstract void eat();
}
