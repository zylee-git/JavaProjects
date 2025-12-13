package com.test.oop3_polymorphismDemo;

public class Administrator extends Person {
    public Administrator(String name, int age) {
        super(name, age);
    }

    @Override
    public void show() {
        System.out.print("Administrator ");
        super.show();
    }
}
