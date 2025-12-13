package com.test.oop3_polymorphismDemo;

public class Teacher extends Person {
    public Teacher(String name, int age) {
        super(name, age);
    }

    @Override
    public void show() {
        System.out.print("Teacher ");
        super.show();
    }
}
