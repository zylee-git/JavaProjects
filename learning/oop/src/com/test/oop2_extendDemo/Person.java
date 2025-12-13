package com.test.oop2_extendDemo;

public class Person {

    public String name;
    public int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void drink() {
        System.out.println("drink water");
    }
}
